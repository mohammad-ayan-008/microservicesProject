package com.lcwd.RatingService.controller;

import com.lcwd.RatingService.entities.Rating;
import com.lcwd.RatingService.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class Ratingcontroller {

    @Autowired
    private RatingServices ratingServices;

    @GetMapping
    public ResponseEntity<List<Rating>> fetchAll(){
        return new ResponseEntity<>(ratingServices.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public  Rating crateEntity(@RequestBody Rating rating){
        return ratingServices.create(rating);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUser
            (@PathVariable String userId){
        return ResponseEntity.ok(ratingServices.getAllBuUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotel(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingServices.getAllByHotelId(hotelId));
    }

}
