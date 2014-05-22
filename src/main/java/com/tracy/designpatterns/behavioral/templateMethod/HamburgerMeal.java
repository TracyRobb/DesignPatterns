/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.behavioral.templateMethod;

/**
 *
 * @author Tracy
 */
public class HamburgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
        System.out.println("Burgers, patties, Fries");
    }

    @Override
    public void cook() {
        System.out.println("Burgers on Grill, Fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throw away paper Plates");
    }
    
    public String finalMeal()
    {
        return "Hamburger";
    }
    
}
