/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.prototype;

/**
 *
 * @author Tracy
 */
public class Student implements Prototype{
    
    String name;
    
    public Student(String name)
    {
        this.name = name;
    }

    public Prototype doClone() {
        return new Student(name);
    }

    @Override
    public String toString() {
        return "name: "+name;
    }
    
    
    
}
