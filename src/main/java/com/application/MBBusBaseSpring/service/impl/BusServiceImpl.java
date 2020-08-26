package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.BusRepository;
import com.application.MBBusBaseSpring.entity.Bus;
import com.application.MBBusBaseSpring.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    BusRepository busRepository;

    @Override
    public Iterable<Bus> getAll() {
        return busRepository.findAll();
    }
}
