package com.workGroup.FlyingControlApp.serviceTest;

import com.workGroup.FlyingControlApp.dao.Dao;
import com.workGroup.FlyingControlApp.dao.impl.FakeDaoImpl;
import com.workGroup.FlyingControlApp.model.Coupon;
import com.workGroup.FlyingControlApp.service.CouponService;
import com.workGroup.FlyingControlApp.service.impl.CouponServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CouponServiceTest {
    @Mock
    private FakeDaoImpl dao;

    @InjectMocks
    private CouponServiceImpl couponService;

    @Test
    public void getDiscountByCouponIdSuccess(){
        final long couponId = 0000000001L;
        Coupon testCoupon = new Coupon(couponId);
        when(dao.getCouponById(couponId)).thenReturn(testCoupon);
        int discount = couponService.getDiscountByCouponId(couponId);
        assertThat(discount != 0 ).isTrue();
    }

}
