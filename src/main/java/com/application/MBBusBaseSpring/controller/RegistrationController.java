package com.application.MBBusBaseSpring.controller;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;
import com.application.MBBusBaseSpring.exception.UserExistException;
import com.application.MBBusBaseSpring.service.dto.RegistrationRequest;
import com.application.MBBusBaseSpring.service.user.UserService;
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

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {
        private static final Logger LOG = LogManager.getLogger(RegistrationController.class);
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
        public String registerUser(@Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm, BindingResult error) {
            LOG.info("Form {}", registrationForm);
            if (error.hasErrors()) {
                return "registration";
            }
            RegistrationRequest registrationRequest = new RegistrationRequest(
                    registrationForm.getFirst_name(), registrationForm.getLast_name(),
                    registrationForm.getLogin(), registrationForm.getPassword(), registrationForm.getRole(),
                    registrationForm.getPassword_confirm());



            try {
                userService.registerUser(registrationRequest);
            } catch (UserExistException e) {
                LOG.error(e.getMessage());
                error.rejectValue("login", "registration.login.exist");
                return "registration";
            }

            return "redirect:/";
        }
}
