package cz.upce.fei.cv01.controller;

import cz.upce.fei.cv01.entity.Student;
import org.springframework.web.bind.annotation.*;

// RestController vs Controller
// YAML vs JSON vs XML
@RestController
//@RequestMapping("api/v1")
public class HelloController {

    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/")
    public String getAge(@RequestParam(defaultValue = "null") Integer age){
        return  "Your age is " + age;
    }

    @PostMapping("/")
    public String getInfoAboutStudent(@RequestBody Student student){
        return "Ahoj: " + student.toString();
    }
}
