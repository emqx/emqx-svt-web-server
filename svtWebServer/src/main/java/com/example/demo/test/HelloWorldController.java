package com.example.demo.test;

import com.example.demo.entity.Response;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
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
            return new Response("修改密码成功", 1, true);
        }
        return new Response("修改密码失败", -1, false);

    }
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Response register(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        String phone = person.get("phone");
        if (username != null && password != null && phone != null) {
            return new Response("注册成功", 1, true);
        }
        return new Response("注册失败", -1, false);

    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response login(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        if (username.equals("张三") && password.equals("123")) {
            return new Response("登陆成功", 1, true);
        }
        return new Response("登陆失败", -1, false);

    }

    @RequestMapping(value = "DeleteUser", method = RequestMethod.DELETE)
    public Response DeleteUser(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        String password = person.get("password");
        if (username != null && password != null) {
            return new Response("删除成功", 1, true);
        }
        return new Response("删除失败", -1, false);
    }
}
