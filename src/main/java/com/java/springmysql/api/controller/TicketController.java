package com.java.springmysql.api.controller;

import com.java.springmysql.api.dao.TicketDao;
import com.java.springmysql.api.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets){
        dao.saveAll(tickets);
        return "Ticket Booked "+tickets;
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTicket(){
        return (List<Ticket>) dao.findAll();
    }

}
