package com.example.Student_Detail1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Student_Detail1.Model.PathModel1;
import com.example.Student_Detail1.Repository1.Repository1;

@Controller
public class Controller1 {

    @Autowired
    Repository1 repo;

    @GetMapping("/home")
    public String home() {
        return "pages/index"; 
    }

    @PostMapping("/submit")
    public String submit(PathModel1 student, Model model) {
        repo.save(student);
        model.addAttribute("message", "Student added successfully!");
        return "pages/index";
    }

}
