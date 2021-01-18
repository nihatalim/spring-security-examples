package controller;

import entity.dto.response.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<String> hello() {
        System.out.println(service.hashCode());
        return ResponseEntity.ok(service.hello());
        //return ResponseEntity.ok(new HelloResponse("nihat"));
    }
}
