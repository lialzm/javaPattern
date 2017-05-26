package com.catfish.strategy;

/**上下文
 * Created by lcy on 17/5/15.
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void contextInterface(){
        //执行具体的算法
        strategy.AlgorithmIntface();
    }

}
