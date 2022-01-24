package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.cache.Cache;
import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.model.Coupon;
import com.workGroup.FlyingControlApp.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {
    private final Dao dao;
    private final Cache<Coupon> cache;

    public CouponServiceImpl(@Autowired Dao dao, @Autowired Cache<Coupon> cache) {
        this.dao = dao;
        this.cache = cache;
    }

    @Override
    public int getDiscountByCouponId(long couponId) {
        Coupon retrievedCoupon = getCouponFromCacheOrDao(couponId);
        int discount = retrievedCoupon.getDiscount();
        return discount;
    }
    private Coupon getCouponFromCacheOrDao(long couponId){
       return cache.checkInCache(couponId) ? cache.findById(couponId) : dao.getCouponById(couponId);
    }
}
