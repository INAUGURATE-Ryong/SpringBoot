package com.example.demo.day4.jpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.day4.jpa.model.Jpa_Board;
import com.example.demo.day4.jpa.repository.BoardRepository;

//@SpringBootApplication
public class JpaboardApplication implements CommandLineRunner{

	@Autowired
	BoardRepository boardRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaboardApplication.class, args);
	}
	
	public void run(String...args) {
		
		//테스트를 위해 글6개 입력
		Jpa_Board b1 = new Jpa_Board();
		b1.setContent("KOSA강좌 추천해 주세요1~");
		b1.setName("세종대왕");		b1.setPasswd("1111");
		b1.setReadcount(0);			b1.setRegdate(new Date());
		b1.setReply(1);				b1.setReplylevel(0);
		b1.setReplystep(0);			b1.setTitle("강좌추천요망1");
		
		boardRepository.save(b1);
		
		Jpa_Board b2 = new Jpa_Board();
		b2.setContent("KOSA강좌 추천해 주세요2~");
		b2.setName("을지문덕");		b2.setPasswd("222");
		b2.setReadcount(0);			b2.setRegdate(new Date());
		b2.setReply(2);				b2.setReplylevel(0);
		b2.setReplystep(0);			b2.setTitle("강좌추천요망2");
		
		boardRepository.save(b2);
			
		Jpa_Board b3 = new Jpa_Board();
		b3.setContent("KOSA강좌 추천해 주세요3~");
		b3.setName("이도연");		b3.setPasswd("1212");
		b3.setReadcount(0);			b3.setRegdate(new Date());
		b3.setReply(3);				b3.setReplylevel(0);
		b3.setReplystep(0);			b3.setTitle("강좌추천요망3");
		
		boardRepository.save(b3);
		
		Jpa_Board b4 = new Jpa_Board();
		b4.setContent("KOSA로 가세요...");
		b4.setName("김유신");		b4.setPasswd("3232");
		b4.setReadcount(0);			b4.setRegdate(new Date());
		b4.setReply(6);				b4.setReplylevel(1);
		b4.setReplystep(1);			b4.setTitle("[답변]강좌추천요망6");
		
		boardRepository.save(b4);
		
		Jpa_Board b5 = new Jpa_Board();
		b5.setContent("KOSA로 가세요...");
		b5.setName("홍길동5");		b5.setPasswd("3333");
		b5.setReadcount(0);			b5.setRegdate(new Date());
		b5.setReply(2);				b5.setReplylevel(1);
		b5.setReplystep(1);			b5.setTitle("[답변]강좌추천요망2");
		
		boardRepository.save(b5);
		
		Jpa_Board b6 = new Jpa_Board();
		b6.setContent("KOSA강좌 추천해 주세요6~");
		b6.setName("무명씨");		b6.setPasswd("5252");
		b6.setReadcount(0);			b6.setRegdate(new Date());
		b6.setReply(6);				b6.setReplylevel(0);
		b6.setReplystep(0);			b6.setTitle("강좌추천요망6");
		
		boardRepository.save(b6);	
		
	}
}
