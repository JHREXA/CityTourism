package CityTourism.hotels_service.repository;

import CityTourism.hotels_service.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel,Long> {

    @Query("SELECT h FROM Hotel h WHERE h.city_id = :city_id")
    List<Hotel> getHotelsByCityId(@Param("city_id") Long city_id);
}
