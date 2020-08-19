package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository <Admin, Integer> {

}
