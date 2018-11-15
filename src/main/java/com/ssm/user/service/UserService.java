package com.ssm.user.service;

import java.util.List;
import com.ssm.user.pojo.User;

public interface UserService {
	List<User> getUsers(int page, int size);

	long getCount();

	List<User> getAllUsers(int page, int size);

	long getAllCount();
}
