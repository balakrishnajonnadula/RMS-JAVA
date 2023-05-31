package com.rms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.entities.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>{

}
