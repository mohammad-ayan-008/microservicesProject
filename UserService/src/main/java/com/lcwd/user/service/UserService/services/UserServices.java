package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entities.Rating;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.repository.UserRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository repository;

    private Logger logger = LoggerFactory.getLogger(UserServices.class);
    public void saveUser(User user){
        repository.save(user);
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    public User getUser(ObjectId id){
        ArrayList <Rating> raatings= restTemplate.getForObject("http://localhost:8811/rating/users/"+id, ArrayList.class);
        logger.info("",raatings);
        Optional<User> byId = repository.findById(id);
        if (byId.isPresent()) {
            User user = byId.get();
            user.setRatings(raatings);
            return user;
        }
        return null;
    }
    public  void deleteById(ObjectId id){
        repository.deleteById(id);
    }

}
