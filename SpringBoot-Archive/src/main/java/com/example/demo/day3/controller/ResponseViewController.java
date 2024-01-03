package com.example.demo.day3.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.day3.table.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseViewController {
	
	@RequestMapping("/response") 
	public String responseView(Model model) {
		
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(2000, "홍길동"));
		list.add(new Emp(3000, "김유신"));
		list.add(new Emp(4000, "이순신"));
		
		model.addAttribute("data", "hello");
		model.addAttribute("list", list);
		model.addAttribute("param1", "world");
		model.addAttribute("param2", "kosa");
		
		   Map<String, Object> foodMap = new HashMap<String, Object>();
	        foodMap.put("food1", "닭발");
	        foodMap.put("food2", "피자");
	        foodMap.put("food3", "삼겹살");
	        foodMap.put("food4", "파스타");

	        model.addAttribute("foodMap", foodMap);
	        model.addAttribute("localDateTime", LocalDate.now());
		return "response/hello";
	}
}
