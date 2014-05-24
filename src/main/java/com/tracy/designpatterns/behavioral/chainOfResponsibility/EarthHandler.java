/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.behavioral.chainOfResponsibility;

/**
 *
 * @author Tracy
 */
public class EarthHandler extends PlanetHandler {
    
    public String handleRequest (PlanetEnum request){
        if(request == PlanetEnum.EARTH){
            System.out.println("EarthHandler handles"+request);
            return "earth";
        }else
            return successor.handleRequest(request);
    }
}
