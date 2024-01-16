package com.lcwd.rating.RatingService.service;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    //create
    Rating create(Rating ratings);

    //getall ratings
    List<Rating> getRatings();

    //get all By UserId
    List<Rating> getRatingsByUserId(String userId);

    //get allby hotel
    List<Rating> getatingsByHotelId(String hotelId);
}
