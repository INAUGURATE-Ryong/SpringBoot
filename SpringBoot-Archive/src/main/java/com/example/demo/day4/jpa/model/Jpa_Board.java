package com.example.demo.day4.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="JPA_BOARD")   //name 지정 안하면! 클래스 이름이 Table 명임.
public class Jpa_Board {  // Model

    @Id  // PK역할을 한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(length = 10)  // 아래는 컬럼이라 지칭  및 길이 지정
    private Integer id;

    @Column(length = 20, nullable = false)  // null 허용안함.
    protected String name;

    @Column(length = 20, nullable = false)
    protected String passwd;

    @Column(length = 500, nullable = false)
    protected String title;

    @Column(length = 4000, nullable = false)
    protected String content;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // 날짜 시간 다 나오게 .DATE는 날짜만 나오게
    protected Date regdate;

    @Column(length = 10, nullable = false)
    protected Integer readcount;  // 조회수

    // 댓글 대댓글을 Integer로 한 이유는 글을 쓰려는게 아니라 들여쓰기 연산을 위해서
    @Column(length = 10, nullable = false)
    protected Integer reply;  // 댓글(

    @Column(length = 10, nullable = false)
    protected Integer replystep;  // 대댓글

    @Column(length = 10, nullable = false)
    protected Integer replylevel;  // 대댓글의 댓글
    /*
reply (댓글)

reply 필드는 댓글의 번호를 나타냅니다. 일반적으로 데이터베이스에서 댓글을 식별하는 데 사용됩니다.
replylevel (대댓글의 레벨)

replylevel 필드는 대댓글의 계층 레벨을 나타냅니다.
예를 들어, 대댓글의 replylevel 값이 1이면 이는 일반 댓글에 대한 대댓글임을 나타냅니다.
replystep (대댓글의 순서)

replystep 필드는 대댓글의 순서를 나타냅니다. 대댓글은 같은 레벨에서 순서대로 정렬되는데,
이때 replystep 값이 사용됩니다. 예를 들어, 같은 부모를 가지는 대댓글 중에서
어떤 대댓글이 먼저 나타날지를 결정합니다.
     */



   
}



