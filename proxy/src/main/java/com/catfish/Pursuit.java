package com.catfish;

/**
 * Created by lcy on 17/7/4.
 */
public class Pursuit implements GiveGift {

    SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    public void giveDolls() {
        System.out.println("送礼物给" + girl.getName());
    }

    public void giveFlowers() {
        System.out.println("送花给" + girl.getName());
    }
}
