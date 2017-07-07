package com.catfish;

/**
 * Created by lcy on 17/7/7.
 */
public class SqlServerFactory implements IFactory {
    public IUser createUser() {
        return new SqlServerUser();
    }

    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
