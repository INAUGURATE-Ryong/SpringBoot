package com.example.demo.day5.model.Answer;

import com.example.demo.day5.model.question.Question;
import com.example.demo.day5.model.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")  // 컬럼을 안써도 컬럼생성이 됨 추가적으로 설정하기 위해 쓰는 어노테이션
    private String content;

    private LocalDateTime createDate;

    @ManyToOne  // 다대일 관계
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany  //다대다 관계
    Set<SiteUser> voter;
}
