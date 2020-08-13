package com.application.MBBusBaseSpring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping
    public String home()
    {

        LOG.info("Inside GET method of HomeController");
        return "home";
    }
}
