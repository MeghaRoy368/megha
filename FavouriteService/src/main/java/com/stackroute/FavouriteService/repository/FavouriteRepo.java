package com.stackroute.FavouriteService.repository;

import com.stackroute.FavouriteService.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepo extends MongoRepository<Favourite,Integer> {
    //Favourite findbyName(String cityName);


}
