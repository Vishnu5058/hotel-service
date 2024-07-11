package com.vrs.hotelService.services;

import java.util.List;

import com.vrs.hotelService.entities.Hotel;

public interface HotelService {
	
	// Save hotel
	public Hotel saveHotel(Hotel hotel);
	
	
	// get all hotels 
	public List<Hotel> getHotels();
	
	// get a hotel with hotel ID
	public Hotel getHotelById(String hotelId);
	

}
