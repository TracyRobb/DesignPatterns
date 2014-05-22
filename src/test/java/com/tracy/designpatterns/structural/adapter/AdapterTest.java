/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.adapter;

import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Tracy
 */
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void adapterTest() {
        //Class
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        
        tempInfo.setTemperatureInC(0);
        
        Assert.assertEquals(0.0, tempInfo.getTemperatureInC(), 0.0);
        Assert.assertEquals(32.0, tempInfo.getTemperatureInF(), 32.0);
        
        //Object
        tempInfo = new TemperatureObjectReporter();
        tempInfo.setTemperatureInF(32);
        Assert.assertEquals(0.0, tempInfo.getTemperatureInC(), 0.0);
        Assert.assertEquals(32.0, tempInfo.getTemperatureInF(), 32.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
