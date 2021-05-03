package com.stackroute.FavouriteService.service;

import com.stackroute.FavouriteService.exception.CityAlreadyExistsException;
import com.stackroute.FavouriteService.model.Favourite;

import java.util.List;

public interface ServiceDao {
    Favourite addCitytoFav(Favourite favourite) throws CityAlreadyExistsException;
    List<Favourite> getAllFavCity();
    void deleteFromFav(int cityId);
    //String displaymsg(String message);
    Favourite updateFavourite(Favourite favourite);
    //Favourite findByName(String cityName);


}
