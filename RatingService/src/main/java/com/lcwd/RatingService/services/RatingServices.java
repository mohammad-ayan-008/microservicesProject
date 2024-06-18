package com.lcwd.RatingService.services;

import com.lcwd.RatingService.entities.Rating;
import com.lcwd.RatingService.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServices {
    @Autowired
    private RatingRepository ratingRepository;

    public Rating create(Rating rating){
        return ratingRepository.save(rating);
    }
    public List<Rating> getAll(){
        return ratingRepository.findAll();
    }
    public List<Rating> getAllBuUserId(String userId){
        return ratingRepository.findByUserId(userId);
    }

    public List<Rating> getAllByHotelId(String hotelId){
        return ratingRepository.findByHotelId(hotelId);
    }
}
