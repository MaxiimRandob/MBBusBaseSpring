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
    private AdminRepository adminRepository;

    @Test
    public void getDriverByIdTest() {
        Assert.assertNotNull(adminRepository.findById(1));

        Admin admin = adminRepository.findById(1).get();
        System.out.println(admin.getFirstName() + " " + admin.getSecondName());
    }
}
