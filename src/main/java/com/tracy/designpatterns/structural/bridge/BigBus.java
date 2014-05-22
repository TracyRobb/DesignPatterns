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
public class BigBus extends Vehicle{

    public BigBus(Engine engine) {
        System.out.println("The big bus is driving");
        this.weightKilos = 3000;
        this.engine = engine;
    }

    @Override
    public String drive() {
        int horsepower = engine.go();
        return reportOnSpeed(horsepower);
    }
    
    
    
}
