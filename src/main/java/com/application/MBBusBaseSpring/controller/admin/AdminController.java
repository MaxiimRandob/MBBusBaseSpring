package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.controller.dto.ProfileForm;
import com.application.MBBusBaseSpring.service.dto.UpdateProfileRequest;
import com.application.MBBusBaseSpring.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    private static final Logger LOG = LogManager.getLogger(AdminController.class);

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/admin/profile")
    public String profile(Model model) {
        LOG.info("Get profile Page");
        model.addAttribute("currentUser", userService.getCurrentUser());
        LOG.info("addAttribute currentUser" + userService.getCurrentUser());
        model.addAttribute("profileForm", new ProfileForm());
        LOG.info("addAttribute profileForm" + new ProfileForm());

        return "adminProfile";
    }

    @PostMapping(value = "/admin/profile")
    public String profile(@ModelAttribute("profileForm") ProfileForm profileForm, Model model) {
        LOG.info("Form {}", profileForm);
        UpdateProfileRequest profileRequest = new UpdateProfileRequest(profileForm.getFirst_name(), profileForm.getLast_name(),
                profileForm.getLogin());

        userService.updateUser(profileRequest);
        return "adminProfile";
    }
}
