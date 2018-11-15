package com.ssm.user.mapper;

import java.util.List;

import com.ssm.user.pojo.User;
import com.ssm.util.MysqlPageUtils;

public interface UserMapper {
    List<User> getUsers(MysqlPageUtils mpu);

    long getCount();

    List<User> getAllUsers(MysqlPageUtils mpu);

    long getAllCount();
}