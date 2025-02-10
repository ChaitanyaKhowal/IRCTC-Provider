package com.irctc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.entity.PassengerData;

public interface PassengerRepository extends JpaRepository<PassengerData, Integer> {
	
	public Optional<PassengerData> findByPnrNo(String pnr);

}
