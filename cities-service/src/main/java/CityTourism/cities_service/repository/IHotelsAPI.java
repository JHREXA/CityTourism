package CityTourism.cities_service.repository;

import CityTourism.cities_service.dto.HotelDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
@CircuitBreaker(name = "hotel-service", fallbackMethod = "fallbackGetCitiesHotel")
@Retry(name = "hotels-service")
public interface IHotelsAPI {

    @GetMapping("/hotels/{city_id}")
    List<HotelDTO> getHotelsByCityId(@PathVariable("city_id") Long cityId);

    default List<HotelDTO> fallbackGetCitiesHotel(Long cityId, Throwable throwable) {
        return List.of();
    }
}




