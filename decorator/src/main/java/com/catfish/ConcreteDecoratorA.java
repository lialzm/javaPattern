package com.catfish;

/**
 * Created by lcy on 17/5/26.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState="装饰a";
        System.out.println("装饰a的操作");

    }
}
