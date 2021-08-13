package com.example.webServer.controller;

import com.example.webServer.entity.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequest {

    @GetMapping("/get/request")
    public Response getRequest(){
        return new Response(200);
    }
    @PostMapping("/post/request")
    public Response postRequest(){
        return new Response(200);
    }
    @PutMapping ("/put/request")
    public Response putRequest(){
        return new Response(200);
    }
    @DeleteMapping("/delete/request")
    public Response deleteRequest(){
        return new Response(200);
    }
}
