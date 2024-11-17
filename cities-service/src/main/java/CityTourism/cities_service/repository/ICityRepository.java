package CityTourism.cities_service.repository;

import CityTourism.cities_service.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City,Long> {

    @Query("SELECT c FROM City c WHERE c.name = :name AND c.country = :country")
    public City findCity(@Param("name") String name,
                                   @Param("country") String country);
}
