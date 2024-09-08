package org.example.DIP.bad.dispatcher;

public class BeeDispatcher {
    public void dispatch(String event, Object payload) {
        System.out.println("Dispatcher: Dispatching event " + event + " with payload " + payload.toString());
    }
}
