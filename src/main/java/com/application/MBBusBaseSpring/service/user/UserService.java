package com.application.MBBusBaseSpring.service.user;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;
import com.application.MBBusBaseSpring.entity.User;
import org.springframework.security.acls.model.NotFoundException;


public interface UserService {
     User getCurrentUser() throws NotFoundException;

     User registerUser( RegistrationRequest request);
}
