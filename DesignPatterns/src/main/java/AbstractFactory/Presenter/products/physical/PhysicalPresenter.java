package AbstractFactory.Presenter.products.physical;

import AbstractFactory.Presenter.Presenter;

public class PhysicalPresenter implements Presenter {
    @Override
    public String present() {
        return "This is an physical product.";
    }
}
