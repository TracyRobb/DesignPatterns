/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.decorator;

/**
 *
 * @author Tracy
 */
public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
    }

    public String describe() {
        animal.describe();
        dance();
        return "I have legs";
        
    }
    
    public void dance()
    {
        System.out.println("I can dance");
    }
    
    
    
}
