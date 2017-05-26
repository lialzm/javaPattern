package com.catfish;

/**装饰抽象类
 * Created by lcy on 17/5/26.
 */
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component!=null){
            component.Operation();
        }
    }
}
