package FlyWeight.Discount;

import java.util.Date;

public class DiscountConstraints {
    private double percentage;
    private double minAmount;
    private double maxAmount;
    private int limit;
    private Date expireDate;

    public DiscountConstraints(double percentage, double minAmount, double maxAmount, int limit, Date expireDate) {
        this.percentage = percentage;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.limit = limit;
        this.expireDate = expireDate;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public int getLimit() {
        return limit;
    }

    public Date getExpireDate() {
        return expireDate;
    }
}
