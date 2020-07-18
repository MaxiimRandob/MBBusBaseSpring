package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;

import java.util.Optional;

public interface AdminService {
     Admin getById(int id);
}
