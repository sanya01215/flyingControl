package com.workGroup.FlyingControlApp.serviceTest;

import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.model.Destination;
import com.workGroup.FlyingControlApp.model.Ticket;
import com.workGroup.FlyingControlApp.service.impl.BaggageServiceImpl;
import com.workGroup.FlyingControlApp.service.impl.TicketServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BaggageServiceTest {
    @Mock
    private FakeDaoImpl fakeDao;
    @InjectMocks
    private BaggageServiceImpl baggageService;

    @Test
    public void isTicketAvailableSuccess() {
        long testBaggageId = 1100000000;
        Baggage testBaggage = new Baggage(testBaggageId,new Destination(testBaggageId));
        when(fakeDao.getBaggageById(anyLong())).thenReturn(testBaggage);

        Assertions.assertTrue(baggageService.baggageCheckIn(testBaggageId,testBaggageId));

    }
}
