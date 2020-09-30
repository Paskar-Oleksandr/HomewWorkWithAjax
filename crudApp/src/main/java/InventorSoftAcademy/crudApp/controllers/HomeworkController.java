package InventorSoftAcademy.crudApp.controllers;

import InventorSoftAcademy.crudApp.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeworkController {

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/homework")
    public User greetingToUser(@RequestParam(required = false, defaultValue = "52") Long id,
                               @RequestParam(required = false, defaultValue = "Ivan") String firstName,
                               @RequestParam(required = false, defaultValue = "Ivanov") String lastName,
                               @RequestParam(required = false, defaultValue = "Ivanov@gmail.com") String email) {
        return new User(id, firstName, lastName, email);
    }
    @GetMapping("/homework-config")
    public User greetingWithConfig(@RequestParam(required = false, defaultValue = "52") Long id,
                               @RequestParam(required = false, defaultValue = "Ivan") String firstName,
                               @RequestParam(required = false, defaultValue = "Ivanov") String lastName,
                               @RequestParam(required = false, defaultValue = "Ivanov@gmail.com") String email) {
        return new User(id, firstName, lastName, email);
    }
}
