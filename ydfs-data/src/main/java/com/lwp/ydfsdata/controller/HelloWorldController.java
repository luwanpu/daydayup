package com.lwp.ydfsdata.controller;

import com.lwp.ydfsdata.pojo.UserInfo;
import com.lwp.ydfsdata.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        UserInfo userByUserName = helloWorldService.getUserByUserName("01");
        return userByUserName.getUsername();
    }

    @RequestMapping("/3error")
    public String hometPage(Model model){
//        model.addAttribute("name","草丛中的发少");
        return "error";
    }

    @RequestMapping("/testerror")
    public String testhomePage(Model model){
        int a = 5/0;
        model.addAttribute("name","草丛中的发少");
        return "login";
    }

}
