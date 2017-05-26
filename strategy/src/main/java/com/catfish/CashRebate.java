package com.catfish;

/**
 * Created by lcy on 17/5/15.
 */
public class CashRebate extends CashSuper{

    private double rebate=1d;


    public CashRebate(String rebate) {
        this.rebate = Double.parseDouble(rebate);
    }

    public double acceptCash(double money) {
        return money*rebate;
    }
}
