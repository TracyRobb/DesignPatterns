/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.abstractFactory;

import org.testng.Assert;
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
public class AbstractTest {
    
    public AbstractTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void landTest() {
        AbstractFactory abs = new AbstractFactory();
        TransportFactory ts = abs.getTransportFactory("land");
        Transport t1 = ts.getTransport("Audi");
        Transport t2 = ts.getTransport("Raliegh");
        
        Assert.assertEquals(t1.typeOfTransport(), "Car");
        Assert.assertEquals(t2.typeOfTransport(), "Bike");
        
    }
    
    @Test
    public void seaTest() {
        AbstractFactory abs = new AbstractFactory();
        TransportFactory ts = abs.getTransportFactory("sea");
        Transport t1 = ts.getTransport("boat");
        Transport t2 = ts.getTransport("waterbike");
        
        Assert.assertEquals(t1.typeOfTransport(), "Boat");
        Assert.assertEquals(t2.typeOfTransport(), "JetSki");
        
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
