package com.flightapp.search.repository;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.search.model.Flight;

@Repository
public interface FlightSearchRepository extends JpaRepository<Flight, Integer>
{
	public List<Flight> findByToPlaceAndFromPlaceAndArrivalAndDeparture(String to, String from, LocalTime arival, LocalTime departure); 
}
