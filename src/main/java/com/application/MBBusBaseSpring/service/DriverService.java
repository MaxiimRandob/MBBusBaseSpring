package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Driver;

import java.util.Optional;

public interface DriverService {
    public Optional<Driver> getById(int id);
}
