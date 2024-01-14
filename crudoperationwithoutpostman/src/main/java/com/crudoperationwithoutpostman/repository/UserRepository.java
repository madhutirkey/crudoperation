package com.crudoperationwithoutpostman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperationwithoutpostman.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
