package com.catfish;

/**
 * Created by lcy on 17/7/12.
 */
public class LiXiaoYao {

    public int vit=10;
    public int atk=10;
    public int def=10;

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }


    public void recoveryState(RoleStateMemento memento){
        this.vit=memento.getVit();
        this.atk=memento.getAtk();
        this.def=memento.getDef();
    }

    public void fight(){
        this.vit=1;
        this.atk=1;
        this.def=1;
    }

    public void display(){
        System.out.println(vit+","+atk+","+def);
    }

}
