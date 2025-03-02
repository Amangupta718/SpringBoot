package com.example.Test.controller;


import org.springframework.web.bind.annotation.*;
import com.example.Test.dto.User;

@RestController
public class HelloRestController {


    // curl localhost:8080/hello -w "\n"
    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }

/*    RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
      return-Hello (name) from Bridgelabz
      api- http://localhost:8080/hello/query?name=Dev
 */
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz";
    }


    /*    RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
      return-Hello (name) from Bridgelabz
      api- http://localhost:8080/params/kush
 */
    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz";
    }
    /*      RequestParam -@PostMapping annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
            return-Hello (firstName) (lastName) from Bridgelabz
            api- http://localhost:8080/post (with custom provided firstName and lastName)
   */

}