package com.workGroup.FlyingControlApp.serviceTest;

import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Ticket;
import com.workGroup.FlyingControlApp.service.impl.TicketService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
public class TicketServiceTest {
    @Mock
    private FakeDaoImpl fakeDao;
    @InjectMocks
    private TicketService ticketService;

    @Test
    public void isTicketAvailableSuccess() {
        long testTicketId = 1111111111;
        Ticket testTicket = new Ticket(testTicketId);
        when(fakeDao.getTicketById(anyLong())).thenReturn(testTicket);

        testTicket.setAvailable(false);
        assertFalse(ticketService.checkAvailableTicket(testTicketId));

        testTicket.setAvailable(true);
        assertTrue(ticketService.checkAvailableTicket(testTicketId));

    }
}
