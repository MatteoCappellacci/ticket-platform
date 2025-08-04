package org.lessons.java.spring.ticket_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tickets")
public class TicketController {


     @GetMapping
    public String index() {
        return "tickets/index";
    }
 
}

