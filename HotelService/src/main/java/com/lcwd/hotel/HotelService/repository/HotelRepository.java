package com.lcwd.hotel.HotelService.repository;

import com.lcwd.hotel.HotelService.entities.Hotel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, ObjectId> {
      Hotel findByHotelId(String hotelId);
}
