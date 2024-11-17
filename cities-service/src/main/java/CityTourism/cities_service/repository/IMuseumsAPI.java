package CityTourism.cities_service.repository;

import CityTourism.cities_service.dto.MuseumDTO;
import CityTourism.cities_service.dto.RestaurantDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name="museum-service")
@CircuitBreaker(name="museum-service", fallbackMethod ="fallbackGetCitiesMuseum")
@Retry(name="museum-service")
public interface IMuseumsAPI {

    @GetMapping("/museums/{cityId}")
    public List<MuseumDTO> getMuseumsCityById(@PathVariable("cityId") Long cityId);

    default List<MuseumDTO> fallbackGetCitiesMuseum(Long cityId, Throwable throwable) {
        List<MuseumDTO> errorList = new ArrayList<>();
        errorList.add(new MuseumDTO(0L, "error", "error", 0L));
        return errorList;

    }
}
