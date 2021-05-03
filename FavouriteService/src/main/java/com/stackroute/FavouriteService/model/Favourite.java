package com.stackroute.FavouriteService.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Favourite_Record")
public class Favourite {

    @Id

    private int cityId;
    //private String message="Already exists";

    private String cityName;

}
