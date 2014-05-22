/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.adapter;

/**
 *
 * @author Tracy
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{

    public double getTemperatureInF() {
        return cToF(temperatureInC);
    }

    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }

    public double getTemperatureInC() {
        return temperatureInC;
    }

    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
    
    public double fToC(double f)
    {
        return ((f - 32) * 5 / 9);
    }
    
    public double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
    
}
