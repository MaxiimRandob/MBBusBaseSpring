package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Assignment;

public interface AssignmentService {

    public Iterable<Assignment> getAll();

    public Assignment getById(int id);

    public void deleteById(int id);

    public void confirmAssignment(int ind);

}
