package state.order.statuses;

public class PendingStatus extends OrderStatus {
    @Override
    public void pending() {
        throw new Error("Order is already pending.");
    }

    @Override
    public void paid() {
        order.transitTo(new PaidStatus());
    }

    @Override
    public void ready() {
        throw new Error("Order can not go directly from pending to ready state.");
    }

    @Override
    public void sent() {
        throw new Error("Order can not go directly from pending to sent state.");
    }

    @Override
    public void delivered() {
        throw new Error("Order can not go directly from pending to delivered state.");
    }
}
