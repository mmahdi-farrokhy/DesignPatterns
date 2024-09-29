package AbstractFactory.Presenter.products.electronic;

import AbstractFactory.Presenter.Product;

public class ElectronicProduct implements Product {
    @Override
    public String title() {
        return "Physical Product";
    }

    @Override
    public String price() {
        return "100 USD";
    }
}
