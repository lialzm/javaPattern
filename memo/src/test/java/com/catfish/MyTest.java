package com.catfish;

import org.junit.Test;

/**
 * Created by lcy on 17/7/12.
 */
public class MyTest {

    @Test
    public void name() throws Exception {

        LiXiaoYao liXiaoYao=new LiXiaoYao();
        liXiaoYao.display();
        RoleStateCaretaker caretaker=new RoleStateCaretaker();
        caretaker.setMemento(liXiaoYao.saveState());
        liXiaoYao.fight();
        liXiaoYao.display();
        liXiaoYao.recoveryState(caretaker.getMemento());
        liXiaoYao.display();
    }
}
