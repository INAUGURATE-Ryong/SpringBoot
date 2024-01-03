package com.example.demo.day1.webDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*
    JSON 예시
    {
        "account" : "뽀로로",
        "email" : "a2wdfd@naver.com",
        "address" : "서울 마포구",
        "password" : "12335",
        "phone_number" : "011-2561-5623",  //스네이크 형식
        "OPT" : "OPT"
    }
 */

@Data
public class PostDTO {

    private String account, email, address,password;

    @JsonProperty("phone_number")
    private String phoneNumber;  //카멜로 되어 있는 것을 스네이크 형식으로~~~

    @JsonProperty("OPT")
    private String OPT;  // 카멜도 스네이크도 아닌 것들은 @JsonProperty 사용해서 인식시킨다.

}
