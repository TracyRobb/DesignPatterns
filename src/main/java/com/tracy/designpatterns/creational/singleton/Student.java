/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.singleton;

/**
 *
 * @author Tracy
 */
public class Student {
    
    private static Student myStudent;
    private String name = "Test";
    
    private Student()
    {
    
    }
    
    public synchronized static Student instance(){
        if(myStudent == null){
            myStudent = new Student();
        }
        return myStudent;
    }
    
    public String getName(){
        return name;
    }
    
}
