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
public abstract class Vehicle {
    Engine engine;
    int weightKilos;
    
    public abstract String drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public String reportOnSpeed(int horsepower)
    {
        int ratio = weightKilos / horsepower;
        
        if(ratio < 3){
            return "Fast Speed";
        }
        else if((ratio >= 3) && (ratio < 8))
        {
            return "Average Speed";
        }
        else
            return "Slow Speed";
    }
    
}
