package com.app.web.controller;

import com.app.web.entity.Student;
import com.app.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository repo;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("studentlist", repo.findAll());
        return "home";
    }

    @GetMapping("/saveStudentPage")
    public String saveStudentPage(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "add_student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/updateStudentPage/{id}")
    public String showUpdateStudentPage(@PathVariable("id") int id, Model model) {
        Optional<Student> temp = repo.findById(id);
        Student student = temp.get();
        model.addAttribute("student", student);
        return "update_student";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}