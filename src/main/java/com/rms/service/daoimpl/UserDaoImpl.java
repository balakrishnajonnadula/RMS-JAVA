package com.rms.service.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entities.UserEntity;
import com.rms.exceptions.UserNotFoundException;
import com.rms.repo.UserRepo;
import com.rms.service.dao.UserDao;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepo repo;

	@Override
	public UserEntity createUser(UserEntity user) {
		UserEntity userEntity = repo.save(user);
		return userEntity;
	}

	@Override
	public List<UserEntity> getAllUsers() {
		List<UserEntity> getAllUsers = repo.findAll();
		return getAllUsers;
	}

	@Override
	public UserEntity getByUserId(String userId) {
		 UserEntity user = repo.findById(userId).orElseThrow(()-> new UserNotFoundException("user not found with : "+userId));
		return user;
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		return null;
	}

	@Override
	public UserEntity deleteUser(String userId) {
		return null;
	}

}
