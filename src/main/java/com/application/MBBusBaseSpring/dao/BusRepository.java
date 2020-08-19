package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus, Integer> {
}
