/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.bridge;

/**
 *
 * @author Tracy
 */
public class SmallEngine implements Engine{
    
    int horsepower;

    public SmallEngine() {
        
        horsepower = 100;
    }
    
    

    public int go() {
         System.out.println("The Small engine is running");
         return horsepower;
    }
    
}
