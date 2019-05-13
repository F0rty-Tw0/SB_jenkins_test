package com.example.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class HomeControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    public void home() {
        assertEquals("index", homeController.home());
    }
}
