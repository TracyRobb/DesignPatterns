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
public class Class2 {
    
    public int doAnotherThing(Class1 clas, int x)
    {
        return 2 * clas.doSomethingComplicated(x);
    }
    
}
