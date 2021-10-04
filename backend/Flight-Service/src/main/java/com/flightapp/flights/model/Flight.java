package com.flightapp.flights.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	@Column(unique = true)
	private String flightNumber;
	@Column(unique = true)
	private String flightAirline;
	private LocalTime arrival;
	private LocalTime departure;
	private String scheduleDays;
	private int ticketCost;
	private int businessClassSeat;
	private int nonBusinessClassSeat;
	private String meal;
	private String fromPlace;
	private String toPlace;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flight(int flightId, String flightNumber, String flightAirline, LocalTime arrival, LocalTime departure,
			String scheduleDays, int ticketCost, int businessClassSeat, int nonBusinessClassSeat, String meal,
			String fromPlace, String toPlace) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.flightAirline = flightAirline;
		this.arrival = arrival;
		this.departure = departure;
		this.scheduleDays = scheduleDays;
		this.ticketCost = ticketCost;
		this.businessClassSeat = businessClassSeat;
		this.nonBusinessClassSeat = nonBusinessClassSeat;
		this.meal = meal;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightAirline() {
		return flightAirline;
	}

	public void setFlightAirline(String flightAirline) {
		this.flightAirline = flightAirline;
	}

	public LocalTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}

	public LocalTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}

	public String getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getBusinessClassSeat() {
		return businessClassSeat;
	}

	public void setBusinessClassSeat(int businessClassSeat) {
		this.businessClassSeat = businessClassSeat;
	}

	public int getNonBusinessClassSeat() {
		return nonBusinessClassSeat;
	}

	public void setNonBusinessClassSeat(int nonBusinessClassSeat) {
		this.nonBusinessClassSeat = nonBusinessClassSeat;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNumber=" + flightNumber + ", flightAirline=" + flightAirline
				+ ", arrival=" + arrival + ", departure=" + departure + ", scheduleDays=" + scheduleDays
				+ ", ticketCost=" + ticketCost + ", businessClassSeat=" + businessClassSeat + ", nonBusinessClassSeat="
				+ nonBusinessClassSeat + ", meal=" + meal + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace
				+ ", getFlightId()=" + getFlightId() + ", getFlightNumber()=" + getFlightNumber()
				+ ", getFlightAirline()=" + getFlightAirline() + ", getArrival()=" + getArrival() + ", getDeparture()="
				+ getDeparture() + ", getScheduleDays()=" + getScheduleDays() + ", getTicketCost()=" + getTicketCost()
				+ ", getBusinessClassSeat()=" + getBusinessClassSeat() + ", getNonBusinessClassSeat()="
				+ getNonBusinessClassSeat() + ", getMeal()=" + getMeal() + ", getFromPlace()=" + getFromPlace()
				+ ", getToPlace()=" + getToPlace() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
