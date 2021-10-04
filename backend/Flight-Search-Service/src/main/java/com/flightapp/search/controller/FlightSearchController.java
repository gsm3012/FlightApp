package com.flightapp.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.search.model.Flight;
import com.flightapp.search.service.FlightSearchService;

@RestController
@RequestMapping("/api/v1.0/user")
public class FlightSearchController 
{
	@Autowired
	private FlightSearchService search;


//  Search Flights
	
	@GetMapping("/flight/search")
	public ResponseEntity<?> searchForFlight(@RequestBody Flight flight)
	{
		List<Flight> flights = this.search.serchFlight(flight.getToPlace(),
								flight.getFromPlace(), flight.getArrival(), flight.getDeparture());
		return ResponseEntity.ok(flights);
	}
	
//	Get Single Filght
	
	@GetMapping("/flight/search/{id}")
	public ResponseEntity<?> serchSingleFlight(@PathVariable int id)
	{
		Flight flight = this.search.serchSingleFlight(id);
		return ResponseEntity.ok(flight);
	}
}
