package com.irctc.service;

import java.util.List;

import com.irctc.entity.PassengerData;

public interface PassengerService {

	public String bookTicket(PassengerData passenger);

	public List<PassengerData> getAllPassenger();

	public PassengerData getPassengerByPnr(String pnr);
	
}
