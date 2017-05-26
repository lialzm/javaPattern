package com.catfish;

import org.junit.Test;

/**
 * Created by lcy on 17/5/26.
 */
public class MyTest {


    @Test
    public void tt(){
        ConcreteComponent concreteComponent=new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
        concreteDecoratorA.setComponent(concreteComponent);
        ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.Operation();
    }

}
