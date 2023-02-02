package com.hotel.service.services;

import com.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    // get single
    Hotel getHotelById(String id);

    // get all
    List<Hotel> getAllHotel();

    // update Hotel
    Hotel updateHotel(String id, Hotel hotel);

    // delete Hotel
    Hotel deleteHotel(String id);
}
