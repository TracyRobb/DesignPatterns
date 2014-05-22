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
public class SmallCar  extends Vehicle{
    
    public SmallCar(Engine engine) {
        System.out.println("The small car is driving");
        this.weightKilos = 600;
        this.engine = engine;
    }
    
    @Override
    public String drive() {
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
    
}
