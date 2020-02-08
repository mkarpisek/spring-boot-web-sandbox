package net.karpisek.sandbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.karpisek.sandbox.dao.CityRepository;
import net.karpisek.sandbox.model.City;

@RestController
public class MainPageController {
	
	@Autowired
	CityRepository cities;

	@GetMapping("/geonames/cities")
	public List<City> cities(@RequestParam(value = "page", defaultValue = "0") String pageParam, @RequestParam(value="pageSize", defaultValue = "50") String pageSizeParam) {
		int page = Integer.parseInt(pageParam);
		int pageSize = Integer.parseInt(pageSizeParam);
		
		List<City> result = new ArrayList<>();
		for (City city : cities.findAll(PageRequest.of(page, pageSize, Direction.ASC, "name"))) {
			result.add(city);
		}
		return result;
	}
	
	@GetMapping("/geonames/cities/count")
	public long citiesCount() {
		return cities.count();
	}
}