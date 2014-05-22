/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.flyweight;

/**
 *
 * @author Tracy
 */
public class FlyweightAdder implements Flyweight{
    
    String operation;

    public int doMath(int a, int b) {
        return (a + b);
    }

    public FlyweightAdder() {
        operation = "adding";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    
    
}
