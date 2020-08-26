package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.Route;
import com.application.MBBusBaseSpring.service.user.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminShowDriversController {
    private static final Logger LOG = LogManager.getLogger(AdminShowDriversController.class);
    @Autowired
    private UserService userService;

    @GetMapping(value = "admin/adminDrivers")
    public String drivers(Model model)
    {
        LOG.info("Inside controller get method for Admin - Drivers");
        Iterable<Driver> drivers = userService.getAllDrivers();
        model.addAttribute("drivers", drivers);
        return "adminDrivers";
    }

}
