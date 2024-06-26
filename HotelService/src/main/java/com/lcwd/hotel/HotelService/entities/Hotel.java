package com.lcwd.hotel.HotelService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hotel {

    @Id
    public ObjectId id;
    public String hotelId;
    public String name;
    public String location;
    public String about;

}
