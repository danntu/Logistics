package kz.logistic.pl.services;

import java.util.List;
import kz.logistic.pl.models.pojos.Country;
import kz.logistic.pl.models.pojos.json.CountryJson;

public interface CountryService {

  List<Country> showAllCountries();

  String addCountry(String countryNameKk, String countryNameRu, String countryNameEn);

  String addCountryJson(CountryJson countryJson);

  String updateCountry(Long countryId, CountryJson countryJson);

  String deleteCountry(Long countryId);
}
