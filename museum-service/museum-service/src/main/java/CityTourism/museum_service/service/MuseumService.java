package CityTourism.museum_service.service;

import CityTourism.museum_service.model.Museum;
import CityTourism.museum_service.repository.IMuseumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuseumService implements IMuseumService{

    @Autowired
    private IMuseumRepository repository;

    @Override
    public List<Museum> getMuseumsCityById(Long cityId) {
        return this.repository.getMuseumsCityById(cityId);
    }
}
