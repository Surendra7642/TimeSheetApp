package com.surya.TimeSheetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.TimeSheetApp.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

	public User findByName(String name);
}
