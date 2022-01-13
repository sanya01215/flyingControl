package com.workGroup.FlyingControlApp.dao.impl;

import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.model.Destination;
import com.workGroup.FlyingControlApp.model.Ticket;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FakeDaoImpl implements Dao {
    private Map<Long, Ticket> ticketMap = new HashMap<>();

    {
        ticketMap.put(1111111111L, new Ticket(1111111111L));
        ticketMap.put(2222222222L, new Ticket(2222222222L));
        ticketMap.put(3333333333L, new Ticket(3333333333L));
        ticketMap.put(4444444444L, new Ticket(4444444444L));
        ticketMap.put(5555555555L, new Ticket(5555555555L));
        ticketMap.put(6666666666L, new Ticket(6666666666L));
    }

    private Map<Long, Baggage> baggageMap = new HashMap<>();

    {
        baggageMap.put(7777777777L, new Baggage(7777777777L,new Destination(7777777777L)));
        baggageMap.put(8888888888L, new Baggage(8888888888L,new Destination(8888888888L)));
        baggageMap.put(9999999999L, new Baggage(9999999999L,new Destination(9999999999L)));
        baggageMap.put(1000000000L, new Baggage(1000000000L,new Destination(1000000000L)));
        baggageMap.put(1100000000L, new Baggage(1100000000L,new Destination(1100000000L)));
        baggageMap.put(1110000000L, new Baggage(1110000000L,new Destination(1110000000L)));
    }

    @Override
    public Ticket getTicketById(long ticketId) {
        return ticketMap.get(ticketId);
    }

    @Override
    public Baggage getBaggageById(long baggageId) {
        return baggageMap.get(baggageId);
    }
}
