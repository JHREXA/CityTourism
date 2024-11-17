package CityTourism.hotels_service.controller;

import CityTourism.hotels_service.model.Hotel;
import CityTourism.hotels_service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService service;

    @GetMapping("/{cityId}")
    List<Hotel> getHotelsByCityId(@PathVariable Long cityId){

        return this.service.getHotelsByCityId(cityId);
    }

}
