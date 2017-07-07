package com.catfish;

/**
 * Created by lcy on 17/7/4.
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        this.pursuit =new Pursuit(girl);
    }

    public void giveDolls() {
        pursuit.giveDolls();
    }

    public void giveFlowers() {
        pursuit.giveFlowers();
    }
}
