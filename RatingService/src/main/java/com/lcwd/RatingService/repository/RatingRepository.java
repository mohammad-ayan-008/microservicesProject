package com.lcwd.RatingService.repository;

import com.lcwd.RatingService.entities.Rating;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, ObjectId> {
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
    //List<Rating> findByHotelId(String hotelId);
}
