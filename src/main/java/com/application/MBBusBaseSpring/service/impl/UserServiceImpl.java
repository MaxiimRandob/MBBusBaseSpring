package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.dao.AdminRepository;
import com.application.MBBusBaseSpring.dao.DriverRepository;
import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.User;
import com.application.MBBusBaseSpring.exception.UserExistException;
import com.application.MBBusBaseSpring.service.dto.RegistrationRequest;
import com.application.MBBusBaseSpring.service.user.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    AdminRepository adminRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User getCurrentUser() throws NotFoundException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (null == auth) {
            throw new NotFoundException("");
        }

        Object obj = auth.getPrincipal();
        String username = "";

        if (obj instanceof UserDetails) {
            username = ((UserDetails) obj).getUsername();
        } else {
            username = obj.toString();
        }

        return userRepository.findByLogin(username).get();
    }

    @Override
    public User registerUser(RegistrationRequest request) {
        LOG.info("Register user");

        String role = request.getRole();


        if (userRepository.existsByLogin(request.getLogin())) {
            throw new UserExistException(String.format("User with login %s already exists", request.getLogin()));
        }

        String password = passwordEncoder.encode(request.getPassword());

        if (role.equalsIgnoreCase("admin")) {
            Admin admin = new Admin(request.getFirst_name(), request.getSecond_name(), request.getLogin(), password, role, request.getEmail());
            LOG.info("Save new admin: " + admin);
            return adminRepository.save(admin);
        } else if (role.equalsIgnoreCase("driver")) {
            Driver driver = new Driver(request.getFirst_name(), request.getSecond_name(), request.getLogin(), password, role, request.getEmail());
            LOG.info("Save new driver: " + driver);
            return driverRepository.save(driver);
        }

        return null;

    }


}
