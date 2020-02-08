package net.karpisek.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.karpisek.sandbox.dao.CityRepository;

@SpringBootTest
class SpringBootWebDemoApplicationTests {
	
	@Autowired
	CityRepository cities;

	@Test
	void contextLoads() {
		assertEquals(23018, cities.count());
	}

}
