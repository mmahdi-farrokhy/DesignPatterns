package Solid.DIP.good.dispatcher;

public interface IDispatcher {
    public void dispatch(String event, Object payload);
}
