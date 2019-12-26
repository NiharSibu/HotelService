package com.mindtree.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.HotelManagement.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

}
