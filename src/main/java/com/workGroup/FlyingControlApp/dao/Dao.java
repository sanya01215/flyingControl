package com.workGroup.FlyingControlApp.dao;

import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.model.Ticket;

public interface Dao {
    public Ticket getTicketById(long ticketId);
    public Baggage getBaggageById(long baggageId);
}
