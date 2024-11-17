package CityTourism.museum_service.repository;

import CityTourism.museum_service.model.Museum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMuseumRepository extends JpaRepository<Museum,Long> {

    @Query("SELECT m FROM Museum m WHERE m.cityId = :cityId")
    List<Museum> getMuseumsCityById(@Param("cityId") Long cityId);
}
