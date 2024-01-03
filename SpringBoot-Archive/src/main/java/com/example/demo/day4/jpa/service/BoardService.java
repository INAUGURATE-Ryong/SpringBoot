package com.example.demo.day4.jpa.service;

import com.example.demo.day4.jpa.model.Jpa_Board;
import org.springframework.data.domain.Page;

public interface BoardService {
	//게시판 리스트 보기
	public Page<Jpa_Board> findAll(Integer curPage);
}
