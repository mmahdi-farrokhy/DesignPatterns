package State.Order.statuses;

import State.Order.Order;

public abstract class OrderStatus {
    protected Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public abstract void pending();

    public abstract void paid();

    public abstract void ready();

    public abstract void sent();

    public abstract void delivered();
}
