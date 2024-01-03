package com.example.demo.day4.jpa.repository;

import com.example.demo.day4.jpa.model.Jpa_Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Jpa_Board, Integer> {
    //JpaRepository를 상속받으면 DML 명령어 필요없다

}
