package com.stackroute.FavouriteService.service;

import com.stackroute.FavouriteService.exception.CityAlreadyExistsException;
import com.stackroute.FavouriteService.model.Favourite;
import com.stackroute.FavouriteService.repository.FavouriteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImp implements ServiceDao{
    private FavouriteRepo favouriteRepo;
    @Autowired
    public ServiceImp(FavouriteRepo favouriteRepo) {
        this.favouriteRepo = favouriteRepo;
    }

    @Override
    public Favourite addCitytoFav(Favourite favourite) throws CityAlreadyExistsException {

        if(favouriteRepo.existsById(favourite.getCityId())){
            throw  new CityAlreadyExistsException();
        }
        Favourite favourite1 = favouriteRepo.save(favourite);
        return favouriteRepo.save(favourite1);


    }

    @Override
    public List<Favourite> getAllFavCity() {
        return favouriteRepo.findAll();
    }

    @Override
    public void deleteFromFav(int cityId) {
        favouriteRepo.deleteById( cityId );
    }



    @Override
    public Favourite updateFavourite(Favourite favourite) {
        return favouriteRepo.save( favourite );
    }


}
