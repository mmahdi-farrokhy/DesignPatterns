package org.example.facade.order;

public class CouponService {
    public boolean isValid(String coupon) {
        return coupon.equals("Something valid");
    }
}
