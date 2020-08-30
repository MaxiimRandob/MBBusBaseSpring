package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.AssignmentRepository;
import com.application.MBBusBaseSpring.entity.Assignment;
import com.application.MBBusBaseSpring.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public Iterable<Assignment> getAll() {
        return assignmentRepository.findAll();
    }
}
