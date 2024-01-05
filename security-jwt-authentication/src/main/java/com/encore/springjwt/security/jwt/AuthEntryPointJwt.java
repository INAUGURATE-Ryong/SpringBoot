package com.encore.springjwt.security.jwt;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//로그인이 올바르지 않을 경우에 수행하는 동작을 Security에서 AuthenticationEntryPoint에서 정의하고 있으며,
//이를 사용자가 정의해서 나타내기도함
@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint { 

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		logger.error("Unauthorized error: {}", authException.getMessage());
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");
	}

}
