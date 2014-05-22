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
public class Class3 {
    
    public int doMoreStuff(Class1 clas, Class2 clas2, int x)
    {
        return clas.doSomethingComplicated(x) * clas2.doAnotherThing(clas, x);
    }
    
}
