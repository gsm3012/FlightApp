package com.flightapp.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.schedule.model.FlightSchedule;
import com.flightapp.schedule.service.FlightScheduleService;

@RestController
@RequestMapping("/api/v1.0/admin/flight/schedule")
public class FlightScheduleController 
{
	@Autowired
	private FlightScheduleService scheduleService;
	
	
//	Create Schedule
	
	@PostMapping("//create")
	public ResponseEntity<?> createSchedule(@RequestBody FlightSchedule flight)
	{
		this.scheduleService.createSchedule(flight);
		return ResponseEntity.ok().build();
	}
	
//	Get All Schedule
	
	@GetMapping("/getall")
	public ResponseEntity<?> getSchedule()
	{
		List<FlightSchedule> allSchedule = this.scheduleService.getAllSchedule();
		return ResponseEntity.ok(allSchedule);
	}

	
//	get single Schedule
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getSingleSchedule(@PathVariable int id)
	{
		FlightSchedule singleSchedule = this.scheduleService.getSingleSchedule(id);
		return ResponseEntity.ok(singleSchedule);
	}
	
//	Update Schedule
	
	@PutMapping("/change")
	public ResponseEntity<?> changeSchedule(@RequestBody FlightSchedule flight)
	{
		this.scheduleService.updateSchedule(flight);
		return ResponseEntity.ok().build();
	}

//	get single Schedule
	
	@DeleteMapping("/cancel/{id}")
	public ResponseEntity<?> deleteSingleSchedule(@PathVariable int id)
	{
		this.scheduleService.deleteSchedule(id);
		return ResponseEntity.ok().build();
	}	
}