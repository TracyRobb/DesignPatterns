/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.behavioral.interpreter;

/**
 *
 * @author Tracy
 */
public interface Expression {
    
    public boolean interpret(String context);
    
}
