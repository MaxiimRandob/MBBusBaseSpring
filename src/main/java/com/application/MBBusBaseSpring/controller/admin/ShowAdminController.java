package com.application.MBBusBaseSpring.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/profile")
public class ShowAdminController {

    @GetMapping
    public String profile()
    {
        return "adminProfile";
    }
}
