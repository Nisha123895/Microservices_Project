package com.lcwd.hotel.HotelService.services.services;

import com.lcwd.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //getall
    List<Hotel> getall();

    //getSingle
    Hotel get(String id);




}
