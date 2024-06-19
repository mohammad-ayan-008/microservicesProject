package com.lcwd.hotel.HotelService.controllers;

import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.services.HotelServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class hotelController {
    @Autowired
    private HotelServices hotelServices;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return new ResponseEntity<>(hotelServices.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
        return  new ResponseEntity<>(hotelServices.create(hotel),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> fetch(@PathVariable String id){
        Optional<Hotel> byId = hotelServices.findByIdHotelID(id);
        if (byId.isPresent()) return new ResponseEntity<>(byId.get(),HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
