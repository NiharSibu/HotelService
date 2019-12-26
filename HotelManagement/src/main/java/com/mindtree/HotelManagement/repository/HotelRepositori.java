package com.mindtree.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.HotelManagement.entity.Hotel;

@Repository
public interface HotelRepositori extends JpaRepository<Hotel, Integer>{

}
