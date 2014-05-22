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
public class PersonDirector {
    
    private PersonBuilder pb = null;
    
    public PersonDirector(PersonBuilder pb)
    {
        this.pb = pb;
    }
    
    public void constructPerson()
    {
        pb.buildFirstName();
        pb.buildLastName();
        pb.buildAge();
    }
    
    public Person getPerson()
    {
        return pb.getPerson();
    }
    
}
