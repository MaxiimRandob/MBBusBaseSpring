package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Bus;
import com.application.MBBusBaseSpring.entity.Route;

public interface BusService {
    public Iterable<Bus> getAll();
}
