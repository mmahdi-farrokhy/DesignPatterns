package AbstractFactory.Presenter.products.physical;

import AbstractFactory.Presenter.Product;

public class PhysicalProduct implements Product {
    @Override
    public String title() {
        return "Electronic Product";
    }

    @Override
    public String price() {
        return "250 USD";
    }
}
