package com.workGroup.FlyingControlApp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coupon {
    private long CouponId;
    private List<Integer> discountsInPercents;
    private int discount=0;

    public Coupon(long couponId) {
        CouponId = couponId;
        this.discountsInPercents = new ArrayList<>();
        discountsInPercents.addAll(Arrays.asList(10,50,60));
    }
    public int getDiscount(){
        if (discount == 0) {
            discount = (int) (Math.random()*10%discountsInPercents.size());
        }
        return discount;
    }
}
