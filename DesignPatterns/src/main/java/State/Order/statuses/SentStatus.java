package State.Order.statuses;

public class SentStatus extends OrderStatus {
    @Override
    public void pending() {
        throw new Error("Sent order can not go back to pending state");
    }

    @Override
    public void paid() {
        throw new Error("Sent order can not go back to paid state");
    }

    @Override
    public void ready() {
        throw new Error("Sent order can not go back to ready state");
    }

    @Override
    public void sent() {
        throw new Error("Order is already sent");
    }

    @Override
    public void delivered() {
        order.transitTo(new DeliveredStatus());
    }
}
