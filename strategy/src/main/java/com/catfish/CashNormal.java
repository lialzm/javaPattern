package com.catfish;

/**正常收费
 * Created by lcy on 17/5/15.
 */
public class CashNormal extends CashSuper {
    public double acceptCash(double money) {
        return money;
    }
}
