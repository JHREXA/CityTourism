package CityTourism.restaurant_service.controller;

import CityTourism.restaurant_service.model.Restaurant;
import CityTourism.restaurant_service.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private IRestaurantService service;

    @GetMapping("/{cityId}")
    public List<Restaurant> getRestaurantsByCityId(@PathVariable Long cityId){
       return this.service.getRestaurantsByCityId(cityId);
    }
}
