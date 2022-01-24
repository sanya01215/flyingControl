package com.workGroup.FlyingControlApp.cache;

import com.workGroup.FlyingControlApp.model.BaseFlyingEntity;

import java.util.List;

public interface Cache<T extends BaseFlyingEntity> {
    T findById(Long id);

    boolean removeById(Long id);

    List<T> getAll();

    boolean add(T entity);

    int getCacheBorderSize();

    void setCacheBorderSize(int cacheBorderSize);

    int getActualCacheSize();

    void setActualCacheSize(int actualCacheSize);

    boolean checkInCache(long id);
}
