package com.irctc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.dto.PassengerDto;
import com.irctc.entity.PassengerData;
import com.irctc.service.PassengerService;

@RestController
public class PassengerRestController {

	@Autowired
	private PassengerService service;

	@PostMapping(value = "/ticket", produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> bookTicket(@RequestBody PassengerData passenger) {

		String bookTicket = service.bookTicket(passenger);

		return new ResponseEntity<String>(bookTicket, HttpStatus.CREATED);

	}

	@GetMapping(value = "/tickets", produces = { "application/json", "text/plain" })
	public ResponseEntity<PassengerDto> getAllTickets() {
		List<PassengerData> allPassenger = service.getAllPassenger();
		PassengerDto response = new PassengerDto(allPassenger);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/passenger/{pnr}")
	public ResponseEntity<?> getPassengerDetails(@PathVariable String pnr) {
		PassengerData passengerByPnr = service.getPassengerByPnr(pnr);
		if (passengerByPnr != null) {
			return ResponseEntity.ok(passengerByPnr);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Ticket found for PNR : " + pnr);
		}
	}

}
