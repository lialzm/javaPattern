package com.catfish;

/**
 * Created by lcy on 17/7/7.
 */
public class AccessDepartment implements IDepartment {
    public void instert() {
        System.out.println("在access添加一条记录");
    }

    public IDepartment getDepartment(Integer id) {
        System.out.println("从access获取一条记录");
        return null;
    }
}
