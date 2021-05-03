package com.stackroute.FavouriteService.controller;

import com.stackroute.FavouriteService.exception.CityAlreadyExistsException;
import com.stackroute.FavouriteService.model.Favourite;
import com.stackroute.FavouriteService.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class FavouriteController {
    private ServiceDao serviceDao;
    @Autowired
    public FavouriteController(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @PostMapping("favourite")
    public ResponseEntity<Favourite> addCitytoFav(@RequestBody Favourite favourite) throws CityAlreadyExistsException {

        

            return new ResponseEntity<Favourite>( serviceDao.addCitytoFav( favourite ), HttpStatus.CREATED);


    }

    @GetMapping("favourites")
    public List<Favourite> getAllFavCity(){
        return serviceDao.getAllFavCity();
    }

    @DeleteMapping("favourite/{cityId}")
    public void deleteFromFav(@PathVariable int cityId){
        serviceDao.deleteFromFav(cityId);
    }

    @PutMapping("favourite")
    public ResponseEntity<Favourite> updateFavourite(@RequestBody Favourite favourite){
        return new ResponseEntity<Favourite>(serviceDao.updateFavourite(favourite),HttpStatus.OK);
    }



}
