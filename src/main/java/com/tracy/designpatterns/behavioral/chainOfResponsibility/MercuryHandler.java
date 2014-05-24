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
public class MercuryHandler extends PlanetHandler{
    
    public String handleRequest (PlanetEnum request){
        if(request == PlanetEnum.MERCURY){
            System.out.println("MecuryHandler handles"+request);
            return "mercury";
        }else
            return successor.handleRequest(request);
    }
    
}
