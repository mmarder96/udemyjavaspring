package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need a controller method to show initial html form
    @RequestMapping("/showform")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new controller method to read form data and add data to the model
    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String myName = request.getParameter("studentName");
        //convert the data to all caps
        myName = myName.toUpperCase();
        // create message
        String result = "Yo! " + myName;
        // add result to the model mapped to key 'message'
        model.addAttribute("message", result);

        return "helloworld";
    }

}
