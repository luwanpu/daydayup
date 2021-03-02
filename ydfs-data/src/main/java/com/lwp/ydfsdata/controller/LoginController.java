package com.lwp.ydfsdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("name","草丛中的发少");
        return "login";
    }
}
