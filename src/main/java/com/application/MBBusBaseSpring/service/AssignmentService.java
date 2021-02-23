package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.Assignment;
import com.application.MBBusBaseSpring.service.dto.AssignmentCreateRequest;

public interface AssignmentService {

    public Iterable<Assignment> getAll();

    public Assignment getById(int id);

    public void deleteById(int id);

    public void confirmAssignment(int ind);

    public void createAssignment(AssignmentCreateRequest createRequest);

}
