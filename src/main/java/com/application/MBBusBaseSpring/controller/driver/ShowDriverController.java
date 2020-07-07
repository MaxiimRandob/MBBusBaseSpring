package com.application.MBBusBaseSpring.controller.driver;

import com.application.MBBusBaseSpring.dao.AdminRepository;
import com.application.MBBusBaseSpring.dao.DriverRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/driver/profile/{id}")
public class ShowDriverController {

    @Autowired
    DriverRepository repository;

    @GetMapping
    public String profile(@PathVariable int id, Model model)
    {
        Optional<Driver> driver = repository.findById(id);
        model.addAttribute("driver", driver.get());
        return "driverProfile";
    }
}
