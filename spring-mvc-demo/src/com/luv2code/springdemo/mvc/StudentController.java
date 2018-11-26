package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showform")
    public String showForm(Model myModel) {

        // create a student object
        Student myStudent = new Student();
        // add student object to the model
        myModel.addAttribute("student", myStudent);
        // add the country options to the model
        myModel.addAttribute("options", countryOptions);

        return "student-form";
    }

    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("student") Student myStudent) {
        return "student-confirmation";
    }

}
