package CityTourism.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MuseumDTO {
    private Long id;
    private String name;
    private String schedule;
    private Long cityId;
}
