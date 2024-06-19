package com.lcwd.user.service.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    public String ratingId;
    public String userId;
    public String hotelId;
    public int rating;
    public String feedback;
    private Hotel hotel;
}
