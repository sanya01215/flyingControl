package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BaggageServiceImpl implements BaggageService {
    private final Dao fakeDao;

    public BaggageServiceImpl(@Autowired FakeDaoImpl fakeDao) {
        this.fakeDao = fakeDao;
    }

    @Override
    public boolean baggageCheckIn(long baggageId, long destinationId) {
        Baggage retrievedBaggage = fakeDao.getBaggageById(baggageId);
        long retrievedBaggageDestinationId = retrievedBaggage.getBaggageDestination().getDestinationId();
        return baggageId == retrievedBaggageDestinationId;
    }
}
