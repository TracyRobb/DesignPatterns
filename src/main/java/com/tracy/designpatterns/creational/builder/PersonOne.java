/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.creational.builder;

/**
 *
 * @author Tracy
 */
public class PersonOne implements PersonBuilder{
    
    private Person person;
    
    public PersonOne(){
        person = new Person();
    }

    public void buildFirstName() {
         person.setFirstName("Tracy");
    }

    public void buildLastName() {
        person.setLastName("Robb");
    }

    public void buildAge() {
        person.setAge(23);
        
    }

    public Person getPerson() {
        return person;
    }
    
}
