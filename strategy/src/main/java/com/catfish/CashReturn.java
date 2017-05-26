package com.catfish;

/**
 * 返利模式
 * Created by lcy on 17/5/15.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    public double acceptCash(double money) {

        if (money >= moneyCondition) {
            return money-Math.floor(money/moneyCondition)*moneyReturn;
        } else {
            return money;
        }

    }
}
