package com.mindtree.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.HotelManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
