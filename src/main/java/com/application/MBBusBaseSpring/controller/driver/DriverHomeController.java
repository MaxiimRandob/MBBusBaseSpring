package com.application.MBBusBaseSpring.controller.driver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/driver")
public class DriverHomeController {

    @GetMapping
    public String profile()
    {
        return "redirect:/driver/profile";
    }
}
