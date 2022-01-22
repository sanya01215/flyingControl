package com.workGroup.FlyingControlApp.controler;

import com.workGroup.FlyingControlApp.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flycontrolapp/api/v1/coupon")
public class CouponController {
    private final CouponService couponService;

    public CouponController(@Autowired CouponService couponService) {
        this.couponService = couponService;
    }
    @GetMapping("/{couponId}")
    public int getDiscount(@PathVariable Long couponId){
        return couponService.getDiscountByCouponId(couponId);
    }
}
