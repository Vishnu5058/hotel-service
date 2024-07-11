package com.vrs.hotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrs.hotelService.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
