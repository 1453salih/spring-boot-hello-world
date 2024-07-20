package ders_video.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {


    //localhost:8080/api/hello
    @GetMapping("/hello")
    public  String sayHello(){
        return "hello world!";
    }

}
