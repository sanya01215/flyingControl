package com.workGroup.FlyingControlApp.dao;

import com.workGroup.FlyingControlApp.model.Baggage;
import com.workGroup.FlyingControlApp.model.Coupon;
import com.workGroup.FlyingControlApp.model.Ticket;

public interface Dao {
     Ticket getTicketById(long ticketId);
     Baggage getBaggageById(long baggageId);
     Coupon getCouponById(long couponId);
     int getSize();

}
