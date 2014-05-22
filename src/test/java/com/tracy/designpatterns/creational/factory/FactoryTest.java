/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.factory;

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
public class FactoryTest {
    
    private static TransportFactory trans;
    private static Transport vehicle1;
    private static Transport vehicle2;
    
    public FactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createTransport() {
        
        trans = new TransportFactory();
        
        vehicle1 =  trans.getTransport("Audi");
        vehicle2 =  trans.getTransport("Raleigh");
        
        Assert.assertEquals("Vehicle Audi Wheels", 4, vehicle1.numWheels());
        
        Assert.assertEquals("Vehicle Raleigh Wheels", 2, vehicle2.numWheels());
        
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
