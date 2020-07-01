package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Route;

import java.util.List;
import java.util.Optional;

public interface RouteService {
    public Iterable<Route> getAll();
}
