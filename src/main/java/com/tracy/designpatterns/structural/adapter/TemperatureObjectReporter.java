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
public class TemperatureObjectReporter implements TemperatureInfo{
    
    CelciusReporter celReport;
    
    public TemperatureObjectReporter(){
        celReport = new CelciusReporter();
    }

    public double getTemperatureInF() {
        return cToF(celReport.getTemperature());
    }

    public void setTemperatureInF(double temperatureInF) {
        celReport.setTemperature(fToC(temperatureInF));
    }

    public double getTemperatureInC() {
        return celReport.getTemperature();
    }

    public void setTemperatureInC(double temperatureInC) {
         celReport.setTemperature(temperatureInC);
    }
    
    public double fToC(double f)
    {
        return ((f - 32) * 5 / 9);
    }
    
    public double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
    
}
