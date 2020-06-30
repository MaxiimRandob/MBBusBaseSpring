package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverDao extends CrudRepository<Driver, Integer> {

}
