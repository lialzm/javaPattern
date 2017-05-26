package com.catfish;

/**
 * Created by lcy on 17/5/15.
 * 定义一个具体的对象,也可以给这个对象添加职责
 */
public class ConcreteComponent extends Component {
    public void Operation() {
        System.out.println("具体的对象操作");
    }
}
