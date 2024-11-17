package CityTourism.hotels_service.service;

import CityTourism.hotels_service.model.Hotel;
import CityTourism.hotels_service.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService{

    @Autowired
    private IHotelRepository repository;

    @Override
    public List<Hotel> getHotelsByCityId(Long city_id) {
        return this.repository.getHotelsByCityId(city_id);
    }
}
