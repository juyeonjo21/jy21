package com.kh.spring16.dto;

import com.kh.spring16.dto.CustomerDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerDto {
	private int customer_no;
	private String customer_id;
	private String customer_contact;
	private String customer_join;
	private String customer_purchase;
	private int customer_mileage;
	private String customer_level;

}
