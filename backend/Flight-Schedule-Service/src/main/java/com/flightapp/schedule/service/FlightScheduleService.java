package com.flightapp.schedule.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.schedule.model.FlightSchedule;
import com.flightapp.schedule.repository.FlightScheduleRepository;

@Service
public class FlightScheduleService 
{
	@Autowired
	private FlightScheduleRepository schedule;
	
	
//	create schedule
	
	public void createSchedule(FlightSchedule flightSchedule)
	{
		this.schedule.save(flightSchedule);
	}

	
//	get  schedule
	
	public List<FlightSchedule> getAllSchedule()
	{
		return this.schedule.findAll();
	}
	
	
//	gets single schedule
	
	public FlightSchedule getSingleSchedule(int id)
	{
		return this.schedule.findById(id).get();
	}
	
	
//	delete schedule
	
	public void deleteSchedule(int id)
	{
		this.schedule.deleteById(id);
	}

	
//	update schedule
	
	public void updateSchedule(FlightSchedule flightSchedule)
	{
		List<FlightSchedule> flights = this.schedule.findAll();
		
		List<FlightSchedule> newFlights = flights.stream().map(e->{
			if(e.getFlightScheduleId()==flightSchedule.getFlightScheduleId())
			{
				e.setFlightDate(flightSchedule.getFlightDate());
				e.setFlightTime(flightSchedule.getFlightTime());
				e.setToPlace(flightSchedule.getToPlace());
				e.setFromPlace(flightSchedule.getFromPlace());
				e.setFlightNumber(flightSchedule.getFlightNumber());
				e.setFlightAirline(flightSchedule.getFlightAirline());
				e.setFlightTIcket(flightSchedule.getFlightTIcket());
				e.setBusinessClassSeat(flightSchedule.getBusinessClassSeat());
				e.setNonBussinessClassSeat(flightSchedule.getNonBussinessClassSeat());
				e.setMeal(flightSchedule.getMeal());
				e.setIsActive(flightSchedule.getIsActive());	
			}
			return e;
		}).collect(Collectors.toList());
		
		this.schedule.saveAll(newFlights);
	}
}

