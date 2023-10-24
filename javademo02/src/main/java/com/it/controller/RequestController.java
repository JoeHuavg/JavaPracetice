package com.it.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {

    @RequestMapping("/simplePara")
    public String simplePara(HttpServletRequest request){
        String name =  request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);
        System.out.printf(name + ":" + age);

        return  "OK";
    }

    @RequestMapping("/simpleRequest")
    public String simpleRequest(@RequestParam(name = "name", required = false) String username, Integer age){
        System.out.printf(username + ":" + age);

        return  "OK";
    }

    @RequestMapping("/listRequest")
    public String listRequest(@RequestParam List<String> person){
        System.out.println("person = " + person);

        return  "OK";
    }


    @RequestMapping("/path/{id}")
    public String pathRequest(@PathVariable Integer id){
        System.out.println("id:" +id);
        return  "OK";
    }


}
