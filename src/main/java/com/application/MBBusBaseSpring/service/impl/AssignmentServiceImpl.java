package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.controller.admin.AdminAssignmentDetailsController;
import com.application.MBBusBaseSpring.dao.*;
import com.application.MBBusBaseSpring.entity.*;
import com.application.MBBusBaseSpring.service.AssignmentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    private static final Logger LOG = LogManager.getLogger(AssignmentServiceImpl.class);

    @Autowired
    AssignmentRepository assignmentRepository;

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    BusRepository busRepository;

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<Assignment> getAll() {
        return assignmentRepository.findAll();
    }

    @Override
    public Assignment getById(int id) {
        return assignmentRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        assignmentRepository.deleteById(id);
    }

    @Override
    public void confirmAssignment(int id) {
        LOG.info(id + " id from confirm method, bus name on assignment");

        Assignment assignment = assignmentRepository.findById(id).get();

        //Retrieving entities from assignment
        Driver driver = assignment.getDriver();
        Route route = assignment.getRoute();
        Bus bus = assignment.getBus();

        //Setting connections between entities due to the assignment
        bus.setRoute(route);
        driver.setBus(bus);

        //Validate other users to prevent exceptions
        Optional<User> validatedUser = userRepository.findByBusId(bus.getId());

        if(validatedUser.isPresent())
        {
            User validatedUserInstance = validatedUser.get();
            validatedUserInstance.setBus(null);
            userRepository.save(validatedUserInstance);
        }

        //Saving refactored instances into repository
        busRepository.save(bus);
        driverRepository.save(driver);

        //Retrieving all currently active assignments
        Iterable<Assignment> assignments = assignmentRepository.findAllByStatus("active");

        //Retrieving all currently active assignments for concrete driver and inactivating them
        inactivateAssignments(assignments, driver.getId());


        //Saving an active assignment
        assignment.setStatus("active");
        assignmentRepository.save(assignment);
    }


    private void inactivateAssignments(Iterable<Assignment> assignments, int driverId) {

        assignments.forEach(assignment -> {
            if (assignment.getDriver().getId() == driverId) {
                assignment.setStatus("inactive");
            }
        });

        assignmentRepository.saveAll(assignments);

    }


}
