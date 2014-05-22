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
public class BigEngine implements Engine{
    
    int horsepower;

    public BigEngine() {
        
        horsepower = 350;
    }
    
    

    public int go() {
         System.out.println("The Big engine is running");
         return horsepower;
    }
    
}
