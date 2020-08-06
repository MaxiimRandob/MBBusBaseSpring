package com.application.MBBusBaseSpring.service.impl;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;
import com.application.MBBusBaseSpring.dao.UserRepository;
import com.application.MBBusBaseSpring.entity.User;
import com.application.MBBusBaseSpring.exception.UserExistException;
import com.application.MBBusBaseSpring.service.UserService;
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

        return userRepository.findByUsername(username).get();
    }

    @Override
    public User registerUser(RegistrationForm form, String role) {
        LOG.info("Register user");
        if (userRepository.existsByLogin(form.getLogin())) {
            throw new UserExistException(String.format("User with login %s already exists", form.getLogin()));
        }

        String password = passwordEncoder.encode(form.getPassword());

        User user = new User(form.getFirst_name(), form.getSecond_name(), form.getLogin(), password, role, form.getEmail());
        LOG.info("Save new user: " + user);
        return userRepository.save(user);
    }
}
