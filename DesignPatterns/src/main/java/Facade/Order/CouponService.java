package Facade.Order;

public class CouponService {
    public boolean isValid(String coupon) {
        return coupon.equals("Something valid");
    }
}
