package CityTourism.museum_service.service;

import CityTourism.museum_service.model.Museum;

import java.util.List;

public interface IMuseumService {

    List<Museum> getMuseumsCityById(Long cityId);
}
