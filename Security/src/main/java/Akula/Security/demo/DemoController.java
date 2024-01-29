package Akula.Security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    @GetMapping("sayHello")
    public ResponseEntity<String> SayHello(){
        return ResponseEntity.ok("Hello buoyyy");
    }
}
