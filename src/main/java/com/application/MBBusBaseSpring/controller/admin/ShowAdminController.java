package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.dao.AdminRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/admin/profile/{id}")
public class ShowAdminController {

    @Autowired
    AdminRepository repository;

    @GetMapping
    public String profile(@PathVariable int id, Model model)
    {
        Optional<Admin> admin = repository.findById(id);
        model.addAttribute("admin", admin.get());
        return "adminProfile";
    }
}
