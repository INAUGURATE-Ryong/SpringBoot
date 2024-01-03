package com.example.demo.day4.jpa.service;

import com.example.demo.day4.jpa.model.Jpa_Board;
import com.example.demo.day4.jpa.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
    BoardRepository boardRepository;
	
	@Override
	//-----------------------------------------
	// 게시판 리스트 보기, 한페이지에 5개씩
	// curPage:요청하는 페이지, 첫페이지는 0
	//-----------------------------------------
	public Page<Jpa_Board> findAll(Integer curPage) {
		PageRequest pr = PageRequest.of(curPage, 5,
				Sort.by(
						Sort.Order.desc("reply"),
						Sort.Order.asc("replystep")
				)
		);
		return boardRepository.findAll(pr);
	}

}
