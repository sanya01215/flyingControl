package com.workGroup.FlyingControlApp.cache.impl;

import com.workGroup.FlyingControlApp.cache.Cache;
import com.workGroup.FlyingControlApp.model.BaseFlyingEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CacheImpl<T extends BaseFlyingEntity> implements Cache<T> {
    private final Map<Long, T> entityMap;
    @Value("${cache.initSize}")
    private int cacheBorderSize;
    private int actualCacheSize;

    public CacheImpl() {
        this.entityMap = new HashMap<>();
    }

    @Override
    public T findById(Long id) {
        return entityMap.get(id);
    }

    @Override
    public boolean removeById(Long id) {
        boolean isRemoved = entityMap.remove(id) !=null;
        if (isRemoved)actualCacheSize--;
        return isRemoved;
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<T>(entityMap.values()) {
        };
    }

    @Override
    public boolean add(T entity) {
        boolean isAdded=false;
        if(cacheBorderSize>actualCacheSize) {
            entityMap.put(entity.getId(), entity);
            actualCacheSize++;
            isAdded=true;
        }
        return isAdded;
    }

    public boolean checkInCache(long id) {
        return entityMap.containsKey(id);
    }


    @Override
    public int getCacheBorderSize() {
        return cacheBorderSize;
    }

    @Override
    public void setCacheBorderSize(int cacheBorderSize) {
        this.cacheBorderSize = cacheBorderSize;
    }

    @Override
    public int getActualCacheSize() {
        return actualCacheSize;
    }

    @Override
    public void setActualCacheSize(int actualCacheSize) {
        this.actualCacheSize = actualCacheSize;
    }
}
