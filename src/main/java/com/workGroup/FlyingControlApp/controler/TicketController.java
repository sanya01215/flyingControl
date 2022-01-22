package com.workGroup.FlyingControlApp.controler;

import com.workGroup.FlyingControlApp.service.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flycontrolapp/api/v1/ticket")
public class TicketController {
    private final TicketServiceImpl ticketServiceImpl;

    public TicketController(@Autowired TicketServiceImpl ticketServiceImpl) {
        this.ticketServiceImpl = ticketServiceImpl;
    }
    @GetMapping("/{id}")
    public boolean isTicketAvailable(@PathVariable Long id){
        return ticketServiceImpl.checkAvailableTicket(id);
    }
}
