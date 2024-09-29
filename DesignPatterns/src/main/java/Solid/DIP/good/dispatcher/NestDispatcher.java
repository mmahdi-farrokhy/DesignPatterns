package Solid.DIP.good.dispatcher;

public class NestDispatcher implements IDispatcher {
    @Override
    public void dispatch(String event, Object payload) {
        fire(event, payload);
    }

    private void fire(String event, Object payload) {
        // Adapter pattern to fix vendor lock-in
    }
}
