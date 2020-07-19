package com.application.MBBusBaseSpring.controller.driver;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/driver/profile")
public class ShowDriverController {

    @Autowired
    UserRepository repository;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public String profile(Model model) {
        Driver driver = (Driver) userService.getCurrentUser();
        model.addAttribute("driver", driver);
        return "driverProfile";
    }
}
