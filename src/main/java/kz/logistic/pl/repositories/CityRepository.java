package kz.logistic.pl.repositories;

import kz.logistic.pl.models.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CityRepository extends JpaRepository<CityEntity, Long> {

    ArrayList<CityEntity> findByCountryIdAndCityNameEn(Long countryId, String cityNameEn);

}
