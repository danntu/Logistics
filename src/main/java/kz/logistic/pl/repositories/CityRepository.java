package kz.logistic.pl.repositories;

import java.util.ArrayList;

import kz.logistic.pl.models.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CityRepository extends JpaRepository<CityEntity, Long> {

  @Query("select c from CityEntity c where c.countryId = ?1 and c.cityNameEn = ?2")
  ArrayList<CityEntity> checkCityInCountry(Long countryId, String cityNameEn);

}
