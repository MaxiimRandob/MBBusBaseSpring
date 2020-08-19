package com.application.MBBusBaseSpring.service.impl;


import com.application.MBBusBaseSpring.dao.RouteRepository;
import com.application.MBBusBaseSpring.entity.Route;
import com.application.MBBusBaseSpring.service.RouteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RouteServiceImpl implements RouteService {
    private static final Logger LOG = LogManager.getLogger(RouteServiceImpl.class);

    @Autowired
    RouteRepository routeRepository;

    @Override
    @Transactional
    public Iterable<Route> getAll() {
        LOG.info("Getting all routes from repo");
        return routeRepository.findAll();
    }

    @Override
    public Iterable<Route> getCurrentWorkload(Iterable<Route> routes) {
        LOG.info("Setting work load into routes");
        routes.forEach(route -> route.setWorkLoad(route.getBuses().size()));
        LOG.info("checking for buses into route: " + routes.iterator().next().getBuses().get(0).getName());
        return routes;
    }

}
