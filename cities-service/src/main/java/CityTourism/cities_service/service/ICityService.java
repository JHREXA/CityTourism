package CityTourism.cities_service.service;

import CityTourism.cities_service.dto.CityDTO;


public interface ICityService {

    CityDTO getCityHotels(String name, String country);
}
