package com.example.demo.day1.controller;

import com.example.demo.day1.webDTO.PostDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
    String : value
    number : value
    boolean : value
    object : value( )
    array : value [ ]

    {
        "phone_number" : "010-2223-1562,
        "age" : 10,
        "isAgree" : false,
        "account" : {
            "email" : "awdd@naver.com",
            "passdword" : "123523"
        }
    }

    //user 조회 하는 경우
    {
        "user_list" : [
            {
                "account" : "kingsmile",
                "password" : "1234",
            },
            {
                "account" : "aaa",
                "password" : "2311",
            },
            {
                "account" : "bvbb",
                "password" : "d221",
            }
        ]


    }
 */
@RestController
@RequestMapping("/api")  // POST, http://localhost:8080/api
public class PostApiController {

    @PostMapping("/post") //http://localhost:8080/api/post
    public void post(@RequestBody Map<String,String> requestData) { //post는 bady에 숨겨져 간다.
//        requestData.entrySet().forEach(strObjectEnrty -> {
//            System.out.println("key : " + strObjectEnrty.getKey());
//            System.out.println("value : " + strObjectEnrty.getValue());
//        });
        requestData.forEach((key,value) -> {

            System.out.println("key " + key );
            System.out.println("value " + value );

        });

    }
    @PostMapping("/post-object") // http://localhost:8080/api/post-object
    public void posObject(@RequestBody PostDTO dto){  // post는 body가 있어야 한다.
        System.out.println(dto);
    }


}
