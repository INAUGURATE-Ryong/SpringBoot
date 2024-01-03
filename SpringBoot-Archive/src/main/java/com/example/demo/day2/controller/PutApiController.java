package com.example.demo.day2.controller;

import com.example.demo.day2.webDTO.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")   // PUT, http://localhost:8080/api
public class PutApiController {

//	@PutMapping("/put")  // http://localhost:8080/api/put
//	public void put(@RequestBody PutRequestDto dto) {
//		System.out.println(dto);
//
//	}

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto dto) {
        System.out.println(dto);

        return dto;
    }
}


/*
{
	"name" : "kingsmile",
	"age" : 33,
	"car_list" : [
			{
				"name":"BMW",
				"car_number": "11가 1234"
			},
			{
				"name":"A4",
				"car_number": "22가 7890"
			}
	]
}
*/
