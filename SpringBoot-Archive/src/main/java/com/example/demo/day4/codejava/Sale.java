package com.example.demo.day4.codejava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
	
	private int id;
	private String item;
	private int quantity;
	private float amount;


	
}
