/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designpatterns.behavioral.mediator;

/**
 *
 * @author Tracy
 */
class Buyer {
    
    Mediator mediator;
    String unitsCurr;

    public Buyer(Mediator mediator, String unitsCurr) {
        this.mediator = mediator;
        this.unitsCurr = unitsCurr;
    }
    
    public boolean attemptPurchase(float bid)
    {
        System.out.println("Buyer attempt bid: "+bid+ " " +unitsCurr);
        return mediator.placeBid(bid, unitsCurr);
    }
    
}
