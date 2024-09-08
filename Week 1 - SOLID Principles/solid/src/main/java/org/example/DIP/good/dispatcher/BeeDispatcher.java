package org.example.DIP.good.dispatcher;

public class BeeDispatcher implements IDispatcher {
    @Override
    public void dispatch(String event, Object payload) {
        System.out.println("Dispatcher: Dispatching event " + event + " with payload " + payload.toString());
    }
}
