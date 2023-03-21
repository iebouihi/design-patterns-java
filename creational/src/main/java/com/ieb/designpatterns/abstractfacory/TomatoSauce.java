package com.ieb.designpatterns.abstractfacory;

public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce..");
    }
}
