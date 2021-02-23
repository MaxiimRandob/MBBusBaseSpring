package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.controller.dto.CreateAssignmentForm;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.AssignmentService;
import com.application.MBBusBaseSpring.service.BusService;
import com.application.MBBusBaseSpring.service.RouteService;
import com.application.MBBusBaseSpring.service.dto.AssignmentCreateRequest;
import com.application.MBBusBaseSpring.service.user.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class AdminCreateAssignmentController {
    private static final Logger LOG = LogManager.getLogger(AdminCreateAssignmentController.class);


    @Autowired
    AssignmentService assignmentService;

    @Autowired
    UserService driverService;

    @Autowired
    BusService busService;

    @Autowired
    RouteService routeService;

    @GetMapping(value = "admin/createAssignmentForm")
    public String assignmentGetCreateForm(Model model)
    {


        model.addAttribute("createAssignmentForm", new CreateAssignmentForm());
        model.addAttribute("drivers", driverService.getAllDrivers());
        model.addAttribute("buses", busService.getAll());
        model.addAttribute("routes", routeService.getAll());

        return "createAssignmentForm";
    }


    @PostMapping(value = "admin/createAssignmentForm")
    public String assignmentCreateForm(@Valid @ModelAttribute("createAssignmentForm") CreateAssignmentForm assignmentForm,Model model)
    {
        LOG.info("INSIDE post method create assignment");
        AssignmentCreateRequest createRequest = new AssignmentCreateRequest(
                Integer.parseInt(assignmentForm.getBusId()),
                Integer.parseInt(assignmentForm.getDriverId()),
                Integer.parseInt(assignmentForm.getRouteId()));

        assignmentService.createAssignment(createRequest);

        return "createAssignmentForm";
    }
}
