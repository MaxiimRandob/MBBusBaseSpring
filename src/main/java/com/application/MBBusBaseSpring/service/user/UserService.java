package com.application.MBBusBaseSpring.service.user;

import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.User;
import com.application.MBBusBaseSpring.service.dto.RegistrationRequest;
import com.application.MBBusBaseSpring.service.dto.UpdateProfileRequest;
import org.springframework.security.acls.model.NotFoundException;


public interface UserService {
     Iterable<Driver> getAllDrivers();

     User getCurrentUser() throws NotFoundException;

     void registerUser(RegistrationRequest request);

     User updateUser(UpdateProfileRequest request);
}
