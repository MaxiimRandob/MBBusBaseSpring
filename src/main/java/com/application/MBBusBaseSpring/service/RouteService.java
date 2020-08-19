package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Route;

public interface RouteService {
    public Iterable<Route> getAll();

    public Iterable<Route> getCurrentWorkload(Iterable<Route> routes);
}
