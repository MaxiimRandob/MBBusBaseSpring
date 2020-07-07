package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.AdminRepository;
import com.application.MBBusBaseSpring.dao.DriverRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Optional<Admin> getById(int id) {
        return adminRepository.findById(id);
    }
}
