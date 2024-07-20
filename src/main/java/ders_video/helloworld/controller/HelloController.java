package ders_video.helloworld.controller;

import org.springframework.web.bind.annotation.*;

//GET   :Veri görüntülemek istediğimiz zaman kullanılır.   @GetMapping
//POST  :Veri kaydetmek istediğimiz zaman kullanılır.      @PostMapping
//PUT   :Veri güncellemek için kullanılır.                 @PutMapping
//PATCH :Verinin bir bölümünü güncellemek için kullanılır. @PatchMapping
//       Örn:Parola güncellemek gibi.
//DELETE:Veri silmek istediğimiz zaman kullanırız.         @DeleteMapping


@RestController
@RequestMapping(path="/api")
public class HelloController {


    //localhost:8080/api/hello
    @GetMapping("/hello")
    public  String sayHello(){
        return "hello world!";
    }
    @PostMapping("/save")
    public String save(){
        return "Data saved!";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted!";
    }

}
