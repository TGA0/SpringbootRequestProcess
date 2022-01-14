package com.example.springbootrequestprocess.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(String name, Model model){
        //填充数据
        model.addAttribute("username",name);

        // viewname
        return "index";
    }
}
