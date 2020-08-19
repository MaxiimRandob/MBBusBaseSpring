package com.application.MBBusBaseSpring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger LOG = LogManager.getLogger(LoginController.class);

    @GetMapping
    public String login(Model model) {

        LOG.info("Get login page");
        return "login";
    }

}
