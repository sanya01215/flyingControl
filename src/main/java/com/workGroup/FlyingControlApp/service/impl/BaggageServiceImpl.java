package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.cache.Cache;
import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BaggageServiceImpl implements BaggageService {
    private final Dao fakeDao;
    private final Cache<Baggage> cache;

    public BaggageServiceImpl(@Autowired FakeDaoImpl fakeDao, @Autowired Cache<Baggage> cache) {
        this.fakeDao = fakeDao;
        this.cache = cache;
    }

    @Override
    public boolean baggageCheckIn(long baggageId, long destinationId) {
        Baggage retrievedBaggage = getBaggageFromCacheOrDao(baggageId);
        long retrievedBaggageDestinationId = retrievedBaggage.getBaggageDestination().getId();
        return baggageId == retrievedBaggageDestinationId;
    }

    private Baggage getBaggageFromCacheOrDao(long baggageId){
        return cache.checkInCache(baggageId) ? cache.findById(baggageId) : fakeDao.getBaggageById(baggageId);
    }
}
