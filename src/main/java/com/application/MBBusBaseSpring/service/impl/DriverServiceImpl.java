package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    UserRepository repository;

    @Override
    public Driver getById(int id) {
        return (Driver)repository.findById(id).get();
    }
}
