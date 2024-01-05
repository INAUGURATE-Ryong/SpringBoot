package com.encore.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.encore.myhome.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
