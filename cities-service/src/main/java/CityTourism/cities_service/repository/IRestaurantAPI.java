package CityTourism.cities_service.repository;

import CityTourism.cities_service.dto.RestaurantDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name="restaurant-service")
@CircuitBreaker(name="restaurant-service", fallbackMethod="fallbackGetCitiesRestaurant")
@Retry(name="restaurant-service")
public interface IRestaurantAPI {

    @GetMapping("restaurants/{cityId}")
    List<RestaurantDTO> getRestaurantsByCityId(@PathVariable("cityId") Long cityId);

    default List<RestaurantDTO> fallbackGetCitiesRestaurant(Long cityId, Throwable throwable) {
        List<RestaurantDTO> errorList = new ArrayList<>();
        errorList.add(new RestaurantDTO(0L, "error", "error", "error", "error", 0L));
        return errorList;
    }

}
