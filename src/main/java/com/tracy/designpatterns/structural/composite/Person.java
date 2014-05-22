/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.structural.composite;

/**
 *
 * @author Tracy
 */
public class Person  implements Component{
    
    String name;

    public Person(String name) {
        this.name = name;
    }
    
    
    
    public void sayHello() {
        
         System.out.println(name + " person says hello");
         
    }

    public void sayGoodbye() {
        
        System.out.println(name + " person says goodbye");
    }
    
}
