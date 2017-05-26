package com.catfish;

/**
 * Created by lcy on 17/5/15.
 */
public class CashFactory {


    public static CashSuper createCashAccept(String type) {
        switch (type) {
            case "正常收费":
                return new CashNormal();
            break;

        }
        return null;
    }

}
