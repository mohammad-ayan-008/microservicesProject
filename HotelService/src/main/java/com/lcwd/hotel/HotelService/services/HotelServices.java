package com.lcwd.hotel.HotelService.services;

import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.repository.HotelRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HotelServices {
    @Autowired
    private HotelRepository hotelRepository;

    public Hotel create(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }
    public Optional<Hotel> findById(ObjectId id){
        return hotelRepository.findById(id);
    }
}
