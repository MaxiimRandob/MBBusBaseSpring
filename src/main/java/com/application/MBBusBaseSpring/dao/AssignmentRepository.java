package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Assignment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface AssignmentRepository extends CrudRepository<Assignment, Integer> {

    public Iterable<Assignment> findAllByStatus(String status);



}
