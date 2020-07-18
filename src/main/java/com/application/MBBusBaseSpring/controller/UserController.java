package com.application.MBBusBaseSpring.controller;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping()
    public String profile(@PathVariable int id, Model model)
    {
        Admin admin = (Admin) repository.findById(id).get();
        model.addAttribute("admin", admin);
        return "adminProfile";
    }
}
