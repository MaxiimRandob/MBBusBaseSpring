package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.Route;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DriverRepositoryTest {
    @Autowired
    private DriverRepository driverRepository;

    @Test
    public void getDriverByIdTest() {
        Assert.assertNotNull(driverRepository.findById(3));

        Driver driver = driverRepository.findById(3).get();
        System.out.println(driver.getFirstName() + " " + driver.getSecondName() + " " + driver.getBusId() + " " + driver.getRole());
    }
}
