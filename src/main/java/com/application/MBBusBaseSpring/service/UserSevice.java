package com.application.MBBusBaseSpring.service;

import com.application.MBBusBaseSpring.entity.User;
import org.springframework.security.acls.model.NotFoundException;

public interface UserSevice {
     User getCurrentUser() throws NotFoundException;
}
