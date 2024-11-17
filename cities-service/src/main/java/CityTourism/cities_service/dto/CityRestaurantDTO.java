package CityTourism.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityRestaurantDTO {

    private Long cityId;
    private String name;
    private String continent;
    private String country;
    private String state;
    private List<RestaurantDTO> restaurantList;
}
