package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminRepositoryTest {
    @Autowired
    private UserRepository adminRepository;

    @Test
    public void getDriverByIdTest() {
        Assert.assertNotNull(adminRepository.findById(1));

        Admin admin = (Admin) adminRepository.findById(1).get();
        System.out.println(admin.getFirstName() + " " + admin.getSecondName() + " " + admin.getPassword() + " " + admin.getUsername() );
    }

    @Test
    public void getAdminByUsernameTest() {
        Assert.assertNotNull(adminRepository.findByUsername("trump"));

        Admin admin = (Admin) adminRepository.findByUsername("trump").get();
        System.out.println(admin.getFirstName() + " " + admin.getSecondName() + " " + admin.getBusId() + " " + admin.getRole());

    }
}
