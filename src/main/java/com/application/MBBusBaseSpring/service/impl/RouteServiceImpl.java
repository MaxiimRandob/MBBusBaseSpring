package com.application.MBBusBaseSpring.service.impl;


import com.application.MBBusBaseSpring.dao.RouteRepository;
import com.application.MBBusBaseSpring.entity.Route;
import com.application.MBBusBaseSpring.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    RouteRepository routeRepository;

    @Override
    @Transactional
    public Iterable<Route> getAll() {
        return routeRepository.findAll();
    }


}
