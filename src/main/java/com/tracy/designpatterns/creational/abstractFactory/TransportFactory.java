/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.abstractFactory;
import com.tracy.designpatterns.creational.factory.*;

/**
 *
 * @author Tracy
 */
public abstract class TransportFactory {
    
    public abstract Transport getTransport(String type);
        
    
}
