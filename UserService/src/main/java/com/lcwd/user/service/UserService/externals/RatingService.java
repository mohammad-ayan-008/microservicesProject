package com.lcwd.user.service.UserService.externals;

import com.lcwd.user.service.UserService.entities.Rating;
import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("RATINGSERVICE")
public interface RatingService  {
    @GetMapping("rating/users/{userid}")
    public Rating[] getRating(@PathVariable ObjectId userid);
}
