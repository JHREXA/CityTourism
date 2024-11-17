package CityTourism.museum_service.controller;

import CityTourism.museum_service.model.Museum;
import CityTourism.museum_service.service.IMuseumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/museums")
public class MuseumController {

    @Autowired
    private IMuseumService service;

    @GetMapping("/{cityId}")
    public List<Museum> getMuseumsCityById(@PathVariable Long cityId){
        return this.service.getMuseumsCityById(cityId);
    }
}
