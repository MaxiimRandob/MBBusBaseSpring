package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface RouteRepository extends CrudRepository<Route, Integer> {
}
