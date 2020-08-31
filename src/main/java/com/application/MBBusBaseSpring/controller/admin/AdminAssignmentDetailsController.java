package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.entity.Assignment;
import com.application.MBBusBaseSpring.service.AssignmentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "admin/assignmentAdminDetails", method={RequestMethod.POST, RequestMethod.GET})
public class AdminAssignmentDetailsController {
    private static final Logger LOG = LogManager.getLogger(AdminAssignmentDetailsController.class);


    @Autowired
    AssignmentService assignmentService;

    @GetMapping
    public String showAssignmentDetails(@RequestParam("assignmentId") int assignmentId, Model model)
    {
        LOG.info("inside showAssignmentDetails method");
        model.addAttribute("assignment", assignmentService.getById(assignmentId));

        return "assignmentAdminDetails";
    }

    @GetMapping(value = "delete")
    public String deleteAssignment(@RequestParam("assignmentId") int assignmentId)
    {
        assignmentService.deleteById(assignmentId);

        return "assignmentAdminDetails";
    }

    @PostMapping(value = "confirm")
    public String confirmAssignment(@RequestParam("assignmentId") int assignmentId, Model model)
    {
        LOG.info("inside confirmAssignment method");
        assignmentService.confirmAssignment(assignmentId);
        return String.format("redirect:/admin/assignmentAdminDetails?assignmentId=%s", assignmentId);
    }
}
