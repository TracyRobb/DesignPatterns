/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.factory;

/**
 *
 * @author Tracy
 */
public class TransportFactory {
    
    public Transport getTransport(String type){
        if("Audi".equals(type)){
            return new Car();
        }else{
            return new Bicycle();
        }
    }
    
}
