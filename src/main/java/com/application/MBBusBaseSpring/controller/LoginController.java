package com.application.MBBusBaseSpring.controller;

import com.application.MBBusBaseSpring.controller.dto.LoginForm;
import com.application.MBBusBaseSpring.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    public UserService userService;

    @GetMapping
    public String login()
    {
       // model.addAttribute("login", new LoginForm());
        return "login";
    }
}
