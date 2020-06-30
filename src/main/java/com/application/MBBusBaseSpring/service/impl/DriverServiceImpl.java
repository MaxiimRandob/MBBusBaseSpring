package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.DriverDao;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverDao driverDao;

    @Override
    public Optional<Driver> getById(int id) {
        return driverDao.findById(id);
    }
}
