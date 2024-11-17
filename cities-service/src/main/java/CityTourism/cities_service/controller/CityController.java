package CityTourism.cities_service.controller;

import CityTourism.cities_service.dto.CityDTO;
import CityTourism.cities_service.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService service;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name,
                                    @RequestParam String country){
        return service.getCityHotels(name, country);
    }
}
