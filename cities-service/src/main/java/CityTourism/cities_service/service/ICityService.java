package CityTourism.cities_service.service;

import CityTourism.cities_service.dto.CityDTO;
import CityTourism.cities_service.dto.CityMuseumDTO;
import CityTourism.cities_service.dto.CityRestaurantDTO;
import CityTourism.cities_service.model.City;


public interface ICityService {

    CityDTO getCityHotels(String name, String country);
    CityRestaurantDTO getCityRestaurants(String name, String country);
    CityMuseumDTO getCityMuseums(String name, String country);
}
