/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.composite;

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
public class CompositeTest {
    
    public CompositeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testComposite() {
        
        Person pers1 = new Person("Tracy");
        Person pers2 = new Person("JR");
        Person pers3 = new Person("Simon");
        
        Composite comp1 = new Composite();
        comp1.add(pers1);
        comp1.add(pers2);
        comp1.add(pers3);
        
        //Assert.assertEquals(pers1.sayHello(), "Tracy person says hello");
        Assert.assertNotNull(comp1);
        
        
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
