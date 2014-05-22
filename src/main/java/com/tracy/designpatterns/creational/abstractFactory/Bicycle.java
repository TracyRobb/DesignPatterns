/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.abstractFactory;

import com.tracy.designpatterns.creational.abstractFactory.Transport;


/**
 *
 * @author Tracy
 */
public class Bicycle extends Transport{
    @Override
    public String typeOfTransport() {
        return "Bike";
    }
    
}
