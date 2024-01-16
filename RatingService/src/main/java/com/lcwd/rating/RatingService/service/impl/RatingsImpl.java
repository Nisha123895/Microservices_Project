package com.lcwd.rating.RatingService.service.impl;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repository.RatingsRepo;
import com.lcwd.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsImpl implements RatingService {

    @Autowired
    private RatingsRepo repository;

    @Override
    public Rating create(Rating ratings) {
        return repository.save(ratings);
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getatingsByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
