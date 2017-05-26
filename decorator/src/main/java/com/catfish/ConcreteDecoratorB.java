package com.catfish;

/**
 * Created by lcy on 17/5/26.
 */
public class ConcreteDecoratorB extends Decorator {


    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("装饰b的操作");
    }


    public void addedBehavior(){

    }
}
