package AbstractFactory.Presenter.products.electronic;

import AbstractFactory.Presenter.Presenter;

public class ElectronicPresenter implements Presenter {
    @Override
    public String present() {
        return "This is an electronic product.";
    }
}
