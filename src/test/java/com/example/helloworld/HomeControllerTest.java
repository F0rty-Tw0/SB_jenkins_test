package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    // her tester vi udenfor Spring context:
    private HomeController homeController = new HomeController();

    @Test
    public void home() {
         org.junit.Assert.assertEquals("index", homeController.home());
         assertNotNull(homeController);
    }
}
