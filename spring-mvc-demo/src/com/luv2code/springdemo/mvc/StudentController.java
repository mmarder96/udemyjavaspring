package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showform")
    public String showForm(Model myModel) {

        // create a student object
        Student myStudent = new Student();
        // add student object to the model
        myModel.addAttribute("student", myStudent);

        return "student-form";
    }

    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("student") Student myStudent) {
        return "student-confirmation";
    }

}
