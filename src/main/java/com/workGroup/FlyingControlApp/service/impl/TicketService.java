package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Ticket;
import com.workGroup.FlyingControlApp.service.FlyControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService implements FlyControlService {
    private FakeDaoImpl fakeDao;

    public TicketService(@Autowired FakeDaoImpl fakeDao) {
        this.fakeDao = fakeDao;
    }

    public boolean checkAvailableTicket(long ticketId) {
        Ticket retrievedTicket = fakeDao.getTicketById(ticketId);
        return retrievedTicket.isAvailable();
    }


}
