/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.abstractFactory;

/**
 *
 * @author Tracy
 */
public class AbstractFactory {
    
    public TransportFactory getTransportFactory(String type)
    {
        if("land".equals(type)){
            return new LandFactory();
        }else
        {
            return new SeaFactory();
        }
    }
    
}
