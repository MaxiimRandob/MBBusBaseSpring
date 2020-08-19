package com.application.MBBusBaseSpring.service.user;

import com.application.MBBusBaseSpring.entity.User;
import com.application.MBBusBaseSpring.service.dto.RegistrationRequest;
import com.application.MBBusBaseSpring.service.dto.UpdateProfileRequest;
import org.springframework.security.acls.model.NotFoundException;


public interface UserService {
     User getCurrentUser() throws NotFoundException;

     User registerUser( RegistrationRequest request);

     User updateUser(UpdateProfileRequest request);
}
