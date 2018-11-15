package com.ssm.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.user.mapper.UserMapper;
import com.ssm.user.pojo.User;
import com.ssm.util.MysqlPageUtils;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers(int page, int size) {
        try {
            MysqlPageUtils mpu = new MysqlPageUtils(page, size);
            List<User> users = userMapper.getUsers(mpu);
            return users;
        } catch (Exception e) {
            logger.error(e.getStackTrace().toString() + "(page=" + page + ",size=" + size + ")");
            return null;
        }
    }

    @Override
    public long getCount() {
        try {
            return userMapper.getCount();
        } catch (Exception e) {
            logger.error(e.getStackTrace().toString());
            return -1;
        }
    }

    @Override
    public List<User> getAllUsers(int page, int size) {
        MysqlPageUtils mysqlPageUtils = new MysqlPageUtils(page, size);
        List<User> allUsers = userMapper.getAllUsers(mysqlPageUtils);
        if (allUsers.isEmpty()) {
            return null;
        }
        return allUsers;
    }

    @Override
    public long getAllCount() {
        long allCount = userMapper.getAllCount();
        if (allCount == 0) {
            return -1;
        }
        return allCount;
    }
}
