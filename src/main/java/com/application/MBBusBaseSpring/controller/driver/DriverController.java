package com.application.MBBusBaseSpring.controller.driver;

import com.application.MBBusBaseSpring.controller.HomeController;
import com.application.MBBusBaseSpring.controller.dto.ProfileForm;
import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.dto.UpdateProfileRequest;
import com.application.MBBusBaseSpring.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class DriverController {
    private static final Logger LOG = LogManager.getLogger(DriverController.class);

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/driver/profile")
    public String profile(Model model) {
        LOG.info("Get profile Page");
        model.addAttribute("currentUser", userService.getCurrentUser());
        LOG.info("addAttribute currentUser" + userService.getCurrentUser());
        model.addAttribute("profileForm", new ProfileForm());
        LOG.info("addAttribute profileForm" + new ProfileForm());

        return "driverProfile";
    }

    @PostMapping(value = "/driver/profile")
    public String profile(@ModelAttribute("profileForm") ProfileForm profileForm, Model model) {
        LOG.info("Form {}", profileForm);
        UpdateProfileRequest profileRequest = new UpdateProfileRequest();
        userService.updateUser(profileRequest);
        return "redirect:/";
    }
}
