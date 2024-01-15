package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));  // 이부분에 의해서 암호화 됨, $2a$10$BypYf1fIOHdNjcB4Zz1h1OssZvdQQYPb8bmo9jT9Ryb7pmPmdVmIK
        this.userRepository.save(user);
        return user;
    }
    
    public SiteUser getUser(String username) {
    	
        Optional<SiteUser> siteUser = this.userRepository.findByusername(username);
        
        if (siteUser.isPresent()) {
            return siteUser.get();
        } else {
            throw new DataNotFoundException("siteuser not found");
        }
    }
}