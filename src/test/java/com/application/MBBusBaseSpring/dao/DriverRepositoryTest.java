package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverRepositoryTest {
    @Autowired
    private UserRepository driverRepository;

    @Test
    public void getDriverByIdTest() {
        Assert.assertNotNull(driverRepository.findById(7));

        Driver driver = (Driver) driverRepository.findById(7).get();
        System.out.println(driver.getFirstName() + " " + driver.getSecondName() + " " + driver.getBusId() + " " + driver.getRole());
    }

    @Test
    public void getDriverByUsernameTest() {
        Assert.assertNotNull(driverRepository.findByLogin("semen"));

        Driver driver = (Driver) driverRepository.findByLogin("semen").get();
        System.out.println(driver.getFirstName() + " " + driver.getSecondName() + " " + driver.getBusId() + " " + driver.getRole());

    }
}
