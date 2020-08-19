package com.application.MBBusBaseSpring.controller.admin;

import com.application.MBBusBaseSpring.entity.Route;
import com.application.MBBusBaseSpring.service.RouteService;
import com.application.MBBusBaseSpring.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminGetRoutesController {
    private static final Logger LOG = LogManager.getLogger(AdminGetRoutesController.class);
    @Autowired
    private RouteService routeService;

    @GetMapping(value = "admin/routes-list")
    public String routes(Model model)
    {
        LOG.info("Inside routes get method");
       Iterable<Route> routes =  routeService.getAll();
       routes = routeService.getCurrentWorkload(routes);
        LOG.info("Adding routes into model");
       model.addAttribute("routes", routes);
       return "routes-list";
    }
}
