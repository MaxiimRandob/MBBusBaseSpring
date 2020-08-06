package com.application.MBBusBaseSpring.controller;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;
import com.application.MBBusBaseSpring.exception.UserExistException;
import com.application.MBBusBaseSpring.security.UserDetailsServiceImpl;
import com.application.MBBusBaseSpring.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;



@Controller
    @RequestMapping(value = "/registration")
    public class RegistrationController {
        private static final Logger LOG = LogManager.getLogger(UserDetailsServiceImpl.class);
        @Autowired
        private UserService userService;
        @Autowired
        @Qualifier("registrationValidator")
        private Validator validator;

        @InitBinder
        private void initBinder(WebDataBinder binder) {
            binder.setValidator(validator);
        }

        @GetMapping
        public String getRegistrationPage(Model model) {
            LOG.info("Get Registration Page");

            model.addAttribute("registrationForm", new RegistrationForm());
            return "registration";
        }

        @PostMapping
        public String registerUser(@ModelAttribute("registrationForm") RegistrationForm registrationForm, BindingResult error) {
            LOG.info("Form {}", registrationForm);
            if (error.hasErrors()) {
                return "registration";
            }

            try {
                userService.registerUser(registrationForm, "DRIVER");
            } catch (UserExistException e) {
                LOG.error(e.getMessage());
                error.rejectValue("login", "registration.login.exist");
                return "registration";
            }

            return "redirect:/";
        }
}
