package com.hotel.service.services.impl;

import com.hotel.service.entities.Hotel;
import com.hotel.service.error.HotelNotFoundException;
import com.hotel.service.repositories.HotelRepository;
import com.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new HotelNotFoundException("Hotel not with specify id: " + id));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel updateHotel(String id, Hotel hotel) {
        Hotel hotel1 = hotelRepository.findById(id).orElseThrow(() -> new HotelNotFoundException("Hotel not with specify id:" + id));
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel deleteHotel(String id) {
        Hotel hotel1 = hotelRepository.findById(id).orElseThrow(() -> new HotelNotFoundException("Hotel not with specify id:" + id));
        hotelRepository.deleteById(id);
        return hotel1;
    }
}
