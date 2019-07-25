package com.srish.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/test")
    public String getTest(){
        return "This is ICP Summer Class";
    }

    @GetMapping("/myid")
    public String getMyid(@RequestParam String id, @RequestParam String name){
        return "ID:"+id + name; }

    @GetMapping("/user/{name}")
    public String getUsername(@PathVariable String name){
        return "Name:" +name;
    }
    @GetMapping("/user")
    public User getUser(){
        User user=new User();
        user.setName("srish");
        user.setLondonMetId("ABC123");

        return user;
    }
}
