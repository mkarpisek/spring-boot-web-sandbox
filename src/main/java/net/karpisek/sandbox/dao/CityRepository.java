package net.karpisek.sandbox.dao;




import org.springframework.data.repository.PagingAndSortingRepository;

import net.karpisek.sandbox.model.City;

public interface CityRepository extends PagingAndSortingRepository<City, Integer> {
}