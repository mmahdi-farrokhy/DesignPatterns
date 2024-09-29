package State.Order.statuses;

public class ReadyStatus extends OrderStatus {
    @Override
    public void pending() {
        order.transitTo(new PendingStatus());
    }

    @Override
    public void paid() {
        throw new Error("Ready order can not go back to paid state");
    }

    @Override
    public void ready() {
        throw new Error("Order is already in ready state");
    }

    @Override
    public void sent() {
        order.transitTo(new SentStatus());
    }

    @Override
    public void delivered() {
        throw new Error("Ready order can not go directly to delivered state");
    }
}
