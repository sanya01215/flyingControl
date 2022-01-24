package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.cache.Cache;
import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements com.workGroup.FlyingControlApp.service.TicketService {
    private final Dao fakeDao;
    private final Cache<Ticket> cache;

    public TicketServiceImpl(@Autowired FakeDaoImpl fakeDao, @Autowired Cache<Ticket> cache) {
        this.fakeDao = fakeDao;
        this.cache = cache;
    }

    public boolean checkAvailableTicket(long ticketId) {
        Ticket retrievedTicket = getTicketFromCacheOrDao(ticketId);
        return retrievedTicket.isAvailable();
    }

    public Ticket getTicketFromCacheOrDao(long ticketId) {
        return cache.checkInCache(ticketId) ? cache.findById(ticketId) : fakeDao.getTicketById(ticketId);
    }


}
