package com.encore.springjwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		System.out.println("all 권한 들어옴");
		return "Public Content.";
	}
	
	@GetMapping("/user")
//	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR')") 이렇게도 가능
	@PreAuthorize("hasRole('USER')")
	public String userAccess() {
	
		System.out.println("user call~");
		return "User Content.";
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		System.out.println("MODERATOR!!!");
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		System.out.println("admin !!!");
		return "Admin Board.";
	}
}
