package com.lcwd.hotel.HotelService.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
public class Hotel {

    @Id
    private ObjectId id;
    private String name;
    private String location;
    private String about;

}
