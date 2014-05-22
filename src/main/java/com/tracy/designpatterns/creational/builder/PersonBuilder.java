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
public interface PersonBuilder {
    
    public void buildFirstName();
    public void buildLastName();
    public void buildAge();
    public Person getPerson();
    
}
