package com.encore.springjwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 이 어노테이션은 모든 출처(*)에 대해 교차 출처 리소스 공유(Cross Origin Resource Sharing)를 허용하고,
// 사전 검사 용청의 최대 시간을 3600초(1시간)로 설정했음
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
//	@PreAuthorize("hasRole('USER')") or hasRole('MODERATOR') or hasRole('ADMIN')
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
