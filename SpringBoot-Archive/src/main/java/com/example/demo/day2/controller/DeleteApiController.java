package com.example.demo.day2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // DELETE, http://localhost:8080/api
public class DeleteApiController {
    @DeleteMapping("/delete/{userId}") //http://localhost:8080/api/delete/andrew...
    public void delete(@PathVariable String userId){
        // delete(@PathVariable(name="userId") String id)
        // delete(@RequestBody String account) http://localhost:8080/api/delete/300?account=andrew
        System.out.println(userId);
    }
    //delete -> 리소스 삭제 200 ok, 자원이 있어서 삭제하던, 없어서 삭제하던 200을 던진다.
}
