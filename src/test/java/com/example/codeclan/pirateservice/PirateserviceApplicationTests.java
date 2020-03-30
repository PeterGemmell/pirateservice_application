package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {


	@Autowired
	ShipRepository shipRepository;

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	RaidRepository raidRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShipAndRaid(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);
		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);
		Raid raid = new Raid("Tortuga", 3000);
		raidRepository.save(raid);
	}

}
