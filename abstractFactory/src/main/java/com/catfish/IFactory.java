package com.catfish;

/**
 * Created by lcy on 17/7/7.
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
