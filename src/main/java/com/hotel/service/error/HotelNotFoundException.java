package com.hotel.service.error;

public class HotelNotFoundException extends RuntimeException {

    public HotelNotFoundException(String s) {
        super(s);
    }

    public HotelNotFoundException() {
        super("Hotel Not Found...");
    }
}
