// src/main/java/com.baekki.edu_system/controller/TeacherController
package com.baekki.edu_system.controller;

import com.baekki.edu_system.model.Teacher;
import com.baekki.edu_system.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherRepository teacherRepository;

    @GetMapping // 경로 안줘도 됨. 위 RequestMapping에 경로 있음.
    public String list(Model model) {
        model.addAttribute("teachers", teacherRepository.findAll());

        return "teacher-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("teacher", new Teacher());

        return "teacher-form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Teacher teacher) {
        teacherRepository.save(teacher);

        return "redirect:/teachers";
    }
}
