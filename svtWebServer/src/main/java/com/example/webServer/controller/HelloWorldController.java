package com.example.webServer.controller;

import com.example.webServer.entity.Response;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author wq
 * @title HelloWorldController
 * @date 2021/8/9 15:56
 * @projectName demo
 * @description
 */
@RestController
public class HelloWorldController {
//    @GetMapping("/hello")
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String queryHelloWorld(){
        return "Hello World";
    }

    @RequestMapping(value = "modify",method = RequestMethod.PUT)
    public Response modify_pwd(@RequestBody Map<String,String> person){
        String password = person.get("password");
        if (password != null){
            return new Response("Password modified successfully", 1, true);
        }
        return new Response("Failed to modify password", -1, false);

    }
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Response register(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        String phone = person.get("phone");
        if (username != null && password != null && phone != null) {
            return new Response("Registration succeeded", 1, true);
        }
        return new Response("Registration failed", -1, false);

    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response login(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        if (username.equals("zhang") && password.equals("123")) {
            return new Response("Login successful", 1, true);
        }
        return new Response("Login failed", -1, false);

    }

    @RequestMapping(value = "DeleteUser", method = RequestMethod.DELETE)
    public Response DeleteUser(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        if (username != null && password != null) {
            return new Response("Delete succeeded", 1, true);
        }
        return new Response("Deletion failed", -1, false);
    }
}
