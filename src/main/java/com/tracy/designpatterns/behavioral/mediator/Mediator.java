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
public class Mediator {
    
    Buyer frenchBuyer;
    Buyer swedishBuyer;
    AmericanSeller american;
    DollarConverter dollar;
    
    public void regiserSwedishBuyer(SwedishBuyer swedishBuyer)
    {
        this.swedishBuyer = swedishBuyer;
    }
    
    public void regiserFrenchBuyer(FrenchBuyer frenchBuyer)
    {
        this.frenchBuyer = frenchBuyer;
    }
    
    public void regiserAmericanSeller(AmericanSeller american)
    {
        this.american = american;
    }
    
    public void regiserDollarConverter(DollarConverter dollar)
    {
        this.dollar = dollar;
    }
    
    public boolean placeBid(float bid, String unitsCurr)
    {
        float dollarAmount = dollar.convertCurr(bid, unitsCurr);
        return american.isBidAccepted(dollarAmount);
    }
    
    
}
