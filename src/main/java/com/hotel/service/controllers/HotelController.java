package com.hotel.service.controllers;

import com.hotel.service.entities.Hotel;
import com.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    // create user
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel tempHotel = hotelService.create(hotel);
        return new ResponseEntity<>(hotel, HttpStatus.CREATED);
    }

    // get user by id
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
        Hotel hotel = hotelService.getHotelById(hotelId);
        return ResponseEntity.ok(hotel);
    }

    // get user by id
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel() {
        List<Hotel> listHotel = hotelService.getAllHotel();
        return ResponseEntity.ok(listHotel);
    }

    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Hotel> deleteHotel(@PathVariable String hotelId) {
        Hotel hotel = hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok(hotel);
    }

    @PutMapping("/{hotelId}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable String hotelId, @RequestBody Hotel user) {
        Hotel hotel1 = hotelService.updateHotel(hotelId, user);
        return ResponseEntity.ok(hotel1);
    }
}
