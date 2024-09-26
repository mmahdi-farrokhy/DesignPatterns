package state.order.statuses;

public class PaidStatus extends OrderStatus {
    @Override
    public void pending() {
        throw new Error("Paid order can not go back to pending state.");
    }

    @Override
    public void paid() {
        throw new Error("Order is already paid.");
    }

    @Override
    public void ready() {
        order.transitTo(new ReadyStatus());
    }

    @Override
    public void sent() {
        throw new Error("Paid order can not go directly to ready state");
    }

    @Override
    public void delivered() {
        throw new Error("Paid order can not go directly to delivered state");
    }
}
