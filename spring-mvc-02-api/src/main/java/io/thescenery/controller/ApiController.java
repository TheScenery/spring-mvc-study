package io.thescenery.controller;
import io.thescenery.dto.User;
import io.thescenery.util.Utils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello1")
    public String hello1() {
        return "Hello1";
    }

    @PostMapping("/hello2")
    public String hello2() {
        return "Hello2";
    }

    @GetMapping("/userName")
    public String userName(@RequestParam("userName") String userName) {
        return userName;
    }

    @GetMapping("/pathTest/{a}/{b}")
    public String pathTest(@PathVariable String a, @PathVariable String b) {
        return a + "-" + b;
    }

    @GetMapping("/json")
    public String json() {
        User user = new User(1, "name1", 3);
        return Utils.toJson(user);
    }

    @GetMapping("/objectParam")
    public String objectParam(User user) {
        return Utils.toJson(user);
    }

    @PostMapping(value = "/body")
    public String body(@RequestBody User user) {
        return Utils.toJson(user);
    }
}
