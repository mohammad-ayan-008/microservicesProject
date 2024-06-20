package com.lcwd.user.service.UserService.externals;

import com.lcwd.user.service.UserService.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTELSERVICE")
public interface HotelServices {

    @GetMapping("hotel/{id}")
    public Hotel getHotel(@PathVariable String id);

}
