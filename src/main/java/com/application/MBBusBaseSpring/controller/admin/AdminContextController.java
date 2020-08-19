package com.application.MBBusBaseSpring.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminContextController {

    @GetMapping
    public String profile() {
        return "redirect:/admin/profile";
    }
}