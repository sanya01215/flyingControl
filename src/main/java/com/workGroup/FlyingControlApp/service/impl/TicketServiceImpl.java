package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements com.workGroup.FlyingControlApp.service.TicketService {
    private final Dao fakeDao;

    public TicketServiceImpl(@Autowired FakeDaoImpl fakeDao) {
        this.fakeDao = fakeDao;
    }

    public boolean checkAvailableTicket(long ticketId) {
        Ticket retrievedTicket = fakeDao.getTicketById(ticketId);
        return retrievedTicket.isAvailable();
    }


}
