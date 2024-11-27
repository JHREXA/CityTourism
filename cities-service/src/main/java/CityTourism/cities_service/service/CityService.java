package CityTourism.cities_service.service;

import CityTourism.cities_service.dto.CityDTO;
import CityTourism.cities_service.dto.CityMuseumDTO;
import CityTourism.cities_service.dto.CityRestaurantDTO;
import CityTourism.cities_service.model.City;
import CityTourism.cities_service.repository.ICityRepository;
import CityTourism.cities_service.repository.IHotelsAPI;
import CityTourism.cities_service.repository.IMuseumsAPI;
import CityTourism.cities_service.repository.IRestaurantAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICityRepository repository;

    @Autowired
    private IHotelsAPI hotelsAPI;

    @Autowired
    private IRestaurantAPI restaurantsAPI;

    @Autowired
    private IMuseumsAPI museumsAPI;

    @Override
    public CityDTO getCityHotels(String name, String country) {

        City city = this.repository.findCity(name,country);

        if (city == null) {
            throw new CityNotFoundException("City not found with name: " + name + " and country: " + country);
        }

        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityId(city.getCity_id());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(city.getCountry());
        cityDTO.setContinent(city.getContinent());
        cityDTO.setState(city.getState());

        cityDTO.setHotelList(hotelsAPI.getHotelsByCityId(city.getCity_id()));


        return cityDTO;
    }

    @Override
    public CityRestaurantDTO getCityRestaurants(String name, String country) {
        City city = this.repository.findCity(name,country);

        if (city == null) {
            throw new CityNotFoundException("City not found with name: " + name + " and country: " + country);
        }

        CityRestaurantDTO cityDTO = new CityRestaurantDTO();
        cityDTO.setCityId(city.getCity_id());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(city.getCountry());
        cityDTO.setContinent(city.getContinent());
        cityDTO.setState(city.getState());

        cityDTO.setRestaurantList(restaurantsAPI.getRestaurantsByCityId(city.getCity_id()));

        return cityDTO;
    }

    @Override
    public CityMuseumDTO getCityMuseums(String name, String country) {
        City city = this.repository.findCity(name,country);

        if (city == null) {
            throw new CityNotFoundException("City not found with name: " + name + " and country: " + country);
        }

        CityMuseumDTO cityDTO = new CityMuseumDTO();
        cityDTO.setCityId(city.getCity_id());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(city.getCountry());
        cityDTO.setContinent(city.getContinent());
        cityDTO.setState(city.getState());

        cityDTO.setMuseumList(museumsAPI.getMuseumsCityById(cityDTO.getCityId()));

        return cityDTO;
    }

    public class CityNotFoundException extends RuntimeException {
        public CityNotFoundException(String message) {
            super(message);
        }
    }

}
