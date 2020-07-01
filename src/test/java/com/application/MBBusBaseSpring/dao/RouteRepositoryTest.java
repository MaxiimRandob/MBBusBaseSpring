package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Route;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
//@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteRepositoryTest {

    @Autowired
    private RouteRepository routeRepository;

    @Test
    public void getAllRoutesTest() {
        Assert.assertNotNull((List<Route>) routeRepository.findAll());
        System.out.println(((List<Route>) routeRepository.findAll()).get(1).getName());
    }
}
