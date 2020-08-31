package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.entity.Assignment;
import com.application.MBBusBaseSpring.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminShowAssignments {

    @Autowired
    AssignmentService assignmentService;

    @GetMapping(value = "admin/adminAssignments")
    public String showAssignments(Model model)
    {
        Iterable<Assignment> assignments = assignmentService.getAll();
        model.addAttribute("assignments", assignments);

        return "adminAssignments";
    }
}
