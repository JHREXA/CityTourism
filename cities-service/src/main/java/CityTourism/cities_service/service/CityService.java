package CityTourism.cities_service.service;

import CityTourism.cities_service.dto.CityDTO;
import CityTourism.cities_service.model.City;
import CityTourism.cities_service.repository.ICityRepository;
import CityTourism.cities_service.repository.IHotelsAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICityRepository repository;

    @Autowired
    private IHotelsAPI hotelsAPI;

    @Override
    public CityDTO getCityHotels(String name, String country) {

        City city = this.repository.findCity(name,country);

        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityId(city.getCity_id());
        cityDTO.setName(city.getName());
        cityDTO.setCountry(city.getCountry());
        cityDTO.setContinent(city.getContinent());
        cityDTO.setState(city.getState());

        cityDTO.setHotelList(hotelsAPI.getHotelsByCityId(city.getCity_id()));

        return cityDTO;
    }
}
