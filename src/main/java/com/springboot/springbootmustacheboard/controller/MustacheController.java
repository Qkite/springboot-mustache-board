package com.springboot.springbootmustacheboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MustacheController {

    @GetMapping(value="/hi")
    public String mustacheCon1(Model model){
        model.addAttribute("username", "user");
        model.addAttribute("id", "manager");
        return "greetings";
    }

    @GetMapping(value="/hi/{id}")
    public String mustacheCon2(Model model, @PathVariable String id){
        model.addAttribute("username", "user");
        model.addAttribute("id", id);
        return "greetings";
    }

}
