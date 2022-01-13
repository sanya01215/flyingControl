package com.workGroup.FlyingControlApp.dao.impl;

import com.workGroup.FlyingControlApp.model.Ticket;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FakeDaoImpl {
private Map<Long,Ticket> ticketMap = new HashMap<>();
    {
        ticketMap.put(1111111111L, new Ticket(1111111111L));
        ticketMap.put(2222222222L, new Ticket(2222222222L));
        ticketMap.put(3333333333L, new Ticket(3333333333L));
        ticketMap.put(4444444444L, new Ticket(4444444444L));
        ticketMap.put(5555555555L, new Ticket(5555555555L));
        ticketMap.put(6666666666L, new Ticket(6666666666L));
    }

    public Ticket getTicketById(long ticketId) {
        return ticketMap.get(ticketId);
    }
}
