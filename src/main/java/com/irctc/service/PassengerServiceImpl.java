package com.irctc.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.entity.PassengerData;
import com.irctc.repo.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository repo;

	@Override
	public String bookTicket(PassengerData passenger) {
		String pnr = generatePNR();
		passenger.setPnrNo(pnr);
		repo.save(passenger);
		return "Ticket Booked Successfully. This is your PNR Number : " + passenger.getPnrNo();
	}

	@Override
	public List<PassengerData> getAllPassenger() {
		return repo.findAll();
	}
	
	

	private String generatePNR() {
		String chars = "0123456789";

		StringBuilder password = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int index = (int) (random.nextFloat() * chars.length());
			password.append(chars.charAt(index));
		}

		String save = password.toString();

		return save;
	}

	@Override
	public PassengerData getPassengerByPnr(String pnr) {

		Optional<PassengerData> pnrNo = repo.findByPnrNo(pnr);
		
		if(pnrNo.isPresent()) {
			PassengerData passengerData = pnrNo.get();
			return passengerData;

		} else {
			return null;
		}
		
	}

}
