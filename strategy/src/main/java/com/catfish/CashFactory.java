package com.catfish;

/**
 * Created by lcy on 17/5/15.
 */
public class CashFactory {


    public static CashSuper createCashAccept(CashType type) {
        switch (type) {
            case Normal:
                return new CashNormal();

            default:

                break;

        }
        return null;
    }

}
