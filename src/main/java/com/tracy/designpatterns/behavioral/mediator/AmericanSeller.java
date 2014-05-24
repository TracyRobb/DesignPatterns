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
class AmericanSeller {
    
    Mediator mediator;
    float priceDollars;

    public AmericanSeller(Mediator mediator, float priceDollars) {
        this.mediator = mediator;
        this.priceDollars = priceDollars;
        this.mediator.regiserAmericanSeller(this);
    }
    
    public boolean isBidAccepted (float bidDollars)
    {
        if(bidDollars >= priceDollars)
            return true;
        else
            return false;
    }
    
    
    
}
