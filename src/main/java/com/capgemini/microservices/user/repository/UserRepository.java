package com.capgemini.microservices.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.microservices.user.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
