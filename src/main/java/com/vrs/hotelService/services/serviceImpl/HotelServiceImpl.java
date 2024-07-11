package com.vrs.hotelService.services.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.hotelService.entities.Hotel;
import com.vrs.hotelService.exceptions.ResourceNotFoundException;
import com.vrs.hotelService.repositories.HotelRepository;
import com.vrs.hotelService.services.HotelService;

@Service
public class HotelServiceImpl  implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		String uuid = UUID.randomUUID().toString();
		hotel.setId(uuid);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel id with given detais not found !! : " + hotelId));
	}

}
