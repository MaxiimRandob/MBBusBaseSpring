package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Route;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


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
        Assert.assertNotNull(routeRepository.findAll());

        List<Route> routes = (List<Route>)routeRepository.findAll();
        routes.forEach(route -> System.out.println(route.getName()));
    }
}
