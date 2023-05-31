package com.rms.service.dao;

import java.util.List;


import com.rms.entities.UserEntity;

public interface UserDao {
	
	public UserEntity createUser(UserEntity user);

	public List<UserEntity> getAllUsers();

	public UserEntity  getByUserId(String userId);

	public UserEntity updateUser(UserEntity user);

	public UserEntity deleteUser(String userId);
	
}
