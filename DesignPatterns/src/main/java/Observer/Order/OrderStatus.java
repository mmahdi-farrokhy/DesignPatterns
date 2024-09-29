package Observer.Order;

public enum OrderStatus {
    PENDING(1),
    PROCESSING(2),
    READY(3),
    SENT(4),
    DELIVERED(5);

    OrderStatus(int value) {
    }
}
