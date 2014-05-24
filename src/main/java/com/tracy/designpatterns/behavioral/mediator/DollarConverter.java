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
class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UNIT = 8.0f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.regiserDollarConverter(this);
    }
    
    public float convertEuroToDollar(float euros){
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        return dollars;
    }
    
    public float convertKronaToDollar(float krona){
        float dollars = krona * (DOLLAR_UNIT / KRONA_UNIT);
        return dollars;
    }
    
    public float convertCurr(float amount,String unitofCurrency){
          if("krona".equals(unitofCurrency)){
              return convertKronaToDollar(amount);
          }else{
              return convertEuroToDollar(amount);
          }
    }
          
      }
