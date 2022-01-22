package com.workGroup.FlyingControlApp.service.impl;

import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.model.Coupon;
import com.workGroup.FlyingControlApp.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {
    private Dao dao;

    public CouponServiceImpl(@Autowired Dao dao) {
        this.dao = dao;
    }

    @Override
    public int getDiscountByCouponId(long couponId) {
        Coupon retrievedCoupon = dao.getCouponById(couponId);
        int discount = retrievedCoupon.getDiscount();
        return discount;
    }
}
