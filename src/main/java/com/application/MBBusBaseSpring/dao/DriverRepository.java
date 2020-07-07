package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

}

