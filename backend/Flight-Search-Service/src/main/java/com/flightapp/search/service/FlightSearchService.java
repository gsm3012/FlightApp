package com.flightapp.search.service;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.search.model.Flight;
import com.flightapp.search.repository.FlightSearchRepository;

@Service
public class FlightSearchService 
{
	@Autowired
	private FlightSearchRepository search;
	
// Search Flight	
	
	public List<Flight> serchFlight(String to, String from, LocalTime arival, LocalTime departure)
	{
		return this.search.findByToPlaceAndFromPlaceAndArrivalAndDeparture(to, from, arival, departure);
	}
	
	
//	Flight by its Id
	
	public Flight serchSingleFlight(int id)
	{
		return this.search.findById(id).orElseThrow(()-> new NoSuchElementException("Flight not found with given Id"));
	}

}
