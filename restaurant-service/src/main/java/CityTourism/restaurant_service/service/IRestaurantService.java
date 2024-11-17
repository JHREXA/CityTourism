package CityTourism.restaurant_service.service;

import CityTourism.restaurant_service.model.Restaurant;

import java.util.List;

public interface IRestaurantService {
    List<Restaurant> getRestaurantsByCityId(Long cityId);
}
