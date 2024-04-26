package aze.coders.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomersController {

    @GetMapping
    public String customers() {
        System.out.println("customer page");
        return "customers";
    }
}
