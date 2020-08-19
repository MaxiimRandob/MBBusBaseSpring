package com.application.MBBusBaseSpring.controller.driver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/driver")
public class DriverContextController {

    @GetMapping
    public String profile() {
        return "redirect:/driver/profile";
    }
}