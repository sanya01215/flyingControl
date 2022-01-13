package com.workGroup.FlyingControlApp.controler;

import com.workGroup.FlyingControlApp.service.impl.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flycontrolapp/api/v1/ticket")
public class TicketController {
    private TicketService ticketService;

    public TicketController(@Autowired TicketService ticketService) {
        this.ticketService = ticketService;
    }
    @GetMapping("/{id}")
    public boolean isTicketAvailable(@PathVariable Long id){
        return ticketService.checkAvailableTicket(id);
    }
}
