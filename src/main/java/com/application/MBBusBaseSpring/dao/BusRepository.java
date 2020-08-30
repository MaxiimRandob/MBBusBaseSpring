package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer> {
}
