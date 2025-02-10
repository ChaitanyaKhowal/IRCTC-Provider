package com.irctc.dto;

import java.util.List;

import com.irctc.entity.PassengerData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDto {

	public List<PassengerData> dto;

}
