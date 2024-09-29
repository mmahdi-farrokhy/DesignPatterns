package State.Order.statuses;

public class DeliveredStatus extends OrderStatus {
    @Override
    public void pending() {
        throw new Error("Delivered order can not go back to pending state");
    }

    @Override
    public void paid() {
        throw new Error("Delivered order can not go back to paid state");
    }

    @Override
    public void ready() {
        throw new Error("Delivered order can not go back to ready state");
    }

    @Override
    public void sent() {
        throw new Error("Delivered order can not go back to sent state");
    }

    @Override
    public void delivered() {
        throw new Error("Order is already delivered");
    }
}
