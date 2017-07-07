package com.catfish;

/**
 * Created by lcy on 17/7/7.
 */
public class SqlServerDepartment implements IDepartment {
    public void instert() {
        System.out.println("增加一个记录");
    }

    public IDepartment getDepartment(Integer id) {
        System.out.println("获取一条记录");
        return null;
    }
}
