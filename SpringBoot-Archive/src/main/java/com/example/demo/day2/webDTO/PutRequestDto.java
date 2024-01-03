package com.example.demo.day2.webDTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
                    //해당 클래스 전체에 일괄적으로 스네이크케이스를 적용하겠다는 것!
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {
    private String name;  //객체지향 형식으로 작성하기 위해 private
    private int age;
    private List<CarDto> carList;

}
