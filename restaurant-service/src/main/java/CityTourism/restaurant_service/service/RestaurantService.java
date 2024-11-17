package CityTourism.restaurant_service.service;

import CityTourism.restaurant_service.model.Restaurant;
import CityTourism.restaurant_service.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements IRestaurantService {

    @Autowired
    private IRestaurantRepository repository;

    @Override
    public List<Restaurant> getRestaurantsByCityId(Long cityId) {
        return this.repository.getRestaurantsCityById(cityId);
    }
}
