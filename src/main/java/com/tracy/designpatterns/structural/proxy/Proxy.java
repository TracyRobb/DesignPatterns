/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Tracy
 */
public class Proxy {
    
    SlowThing slow;

    public Proxy() {
        System.out.println("Createing proxy at: "+ new Date());
    }
    
    public String sayHello()
    {
        if(slow == null)
        {
            slow = new SlowThing();
        }
        
        return slow.sayHello();
    }
    
    
}
