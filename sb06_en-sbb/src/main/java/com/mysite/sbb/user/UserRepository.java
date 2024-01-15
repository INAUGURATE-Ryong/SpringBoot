package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
	
	// Optional 자바 8에서 도입됨. 값이 있을 수도 있고, 없을 수도 있는 경우를 나타내는 래퍼 클래스 
	Optional<SiteUser> findByusername(String username);
}