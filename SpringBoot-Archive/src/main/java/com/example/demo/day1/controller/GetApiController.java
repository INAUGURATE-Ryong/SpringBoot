package com.example.demo.day1.controller;

import com.example.demo.day1.webDTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")  //GET,  http://localhost:8080/api/get
public class GetApiController {
    @GetMapping("/hello") //GET,  http://localhost:8080/api/get/hello
//    @RequestMapping(path = "/api/get/hello",method = RequestMethod.GET)
    public String getHello(){
        return "<h1>Hello SpringBoot</h1>";

    }
    @RequestMapping(path ="/hi",method = RequestMethod.GET) //http://localhost:8080/api/get/hi
    public String hi(){
        return "<font color='red'>hi~~~</font>";
    }
//    @GetMapping("pathVariable/{id}") //11버전에선 주소줄에 대문자가 들어가면 안된다 했는데...지금은 잘됨.
    @GetMapping("/path-variable/{id}")  //매번 주소가 변화 되는 내용을 받겠다면  {}  변경될 내용 기재
//    public String pathVariable(@PathVariable String id){  //http://localhost:8080/api/get/path-variable/
    public String pathVariable(@PathVariable(name = "id") String pathId){
        //변수값이 pathId처럼 일치하지 않을 때에는 저런 옵션을 넣어줘야 한다.
        System.out.println("PathVariable : " + pathId);
        return pathId;
    }

    //구글에서 검색어 yuna로 검색 결과
    //https://www.google.co.kr/
    // search?q=IU
    // &sca_esv=593016252&hl=ko
    // &ei=KC-FZcnJG8nFhwOMgZuwCw&ved=0ahUKEwjJ_cvWt6KDAxXJ4mEKHYzABrYQ4dUDCBA
    // &uact=5
    // &oq=IU&gs_lp=Egxnd3Mtd2l6LXNlcnAiAklVMggQABiABBiwAzIIEAAYgAQYsAMyCBAAGIAEGLADMggQABiABBiwAzIIEAAYgAQYsAMyCxAAGIAEGLEDGLADMggQABiABBiwAzIOEAAYgAQYsQMYgwEYsAMyCBAAGIAEGLADMggQABiABBiwAzIIEAAYgAQYsAMyCBAAGIAEGLADMg4QABjkAhjWBBiwA9gBATIOEAAY5AIY1gQYsAPYAQEyDhAAGOQCGNYEGLAD2AEBMhQQLhiABBixAxiDARjIAxiwA9gBAjIaEC4YgAQYsQMYgwEYxwEY0QMYyAMYsAPYAQIyFxAuGIAEGLEDGMcBGNEDGMgDGLAD2AECMg4QLhiABBjIAxiwA9gBAkiKBFAAWABwAXgAkAEAmAEAoAEAqgEAuAEDyAEA4gMEGAEgQYgGAZAGE7oGBggBEAEYCboGBggCEAEYCA
    // &sclient=gws-wiz-serp
    //?key1=value1&key2=value2&key3=value3......
    @GetMapping(path = "query-param01")  //http://localhost:8080/api/get/query-param01?name=yuna&email=aa@naver.com&age=22
    public String queryParam01(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String age){

        System.out.println("name = " + name + ", email = " + email + ", age = " + age);


        return name+", " + email+", "+age;
    }
    @GetMapping(path = "query-param02") //http://localhost:8080/api/get/query-param02?user=andrew&email=scc@naver.com&age=19
    //http://localhost:8080/api/get/query-param02?user=andrew&email=scc@naver.com&age=19&address=seoul&tel=02-122-333
    //이렇게 값이 많아도 상관없음.
    public String queryParam02(@RequestParam Map<String,String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry ->{
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    sb.append(entry.getKey()+ "=" + entry.getValue());
                }
                );


//        for (Map.Entry<String,String> entry : queryParam.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//
//            sb.append(entry.getKey()+ "=" + entry.getValue());
//        }
        return sb.toString();

    }
    //?key1=value1&key2=value2&key3=value3......
    @GetMapping(path = "query-param03")  //http://localhost:8080/api/get/query-param03?user=andrew&email=scc@naver.com&age=19
    //위처럼 더 넣어도! 객체에 있는 name,age,email만 받아옴.
    public String queryParam03(UserDTO dto){  //객체 타입으로 리턴할때는 @RequestParam안쓴다. 권장하는 방식!!!

        System.out.println(dto.getName());
        System.out.println(dto.getAge());
        System.out.println(dto.getEmail());

        return dto.toString();
    }
}
