/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.facade;

/**
 *
 * @author Tracy
 */
public class Facade {
    
    public int cubeX(int x)
    {
        Class1 clas = new Class1();
        return clas.doSomethingComplicated(x);
    }
    
    public int cubeXTimes2(int x)
    {
        Class1 clas = new Class1();
        Class2 clas2 = new Class2();
        return clas2.doAnotherThing(clas, x);
    }
    
    public int xToSixthPowerTimes2(int x)
    {
        Class1 clas = new Class1();
        Class2 clas2 = new Class2();
        Class3 clas3 = new Class3();
        
        return clas3.doMoreStuff(clas, clas2, x);
    }
    
}
