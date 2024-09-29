package State.Order;

import State.Order.statuses.OrderStatus;
import State.Order.statuses.PendingStatus;

public class Order {
    private OrderStatus status;

    public Order() {
        transitTo(new PendingStatus());
    }

    public void transitTo(OrderStatus status) {
        this.status = status;
        this.status.setOrder(this);
    }

    public void pend() {
        status.pending();
    }

    public void pay() {
        status.paid();
    }

    public void ready() {
        status.ready();
    }

    public void send() {
        status.sent();
    }

    public void deliver() {
        status.delivered();
    }
}
