package com.krealll.day4_2.service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JaggedArrayServiceTest {

    JaggedArrayService jaggedArrayService;
    
    @BeforeMethod
    public void setUp() {
        jaggedArrayService = new JaggedArrayService();
    }

    @Test
    public void testBubbleSort() {
        //TODO: add sort tests with copying
    }
}