package com.lance.dubbo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lance.dubbo.modal.UserInfo;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Override
	public UserInfo findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> findByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserInfo info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(UserInfo info) {
		// TODO Auto-generated method stub

	}
}
