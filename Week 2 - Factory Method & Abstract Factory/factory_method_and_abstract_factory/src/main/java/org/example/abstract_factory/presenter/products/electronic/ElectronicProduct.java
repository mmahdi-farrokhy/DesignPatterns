package org.example.abstract_factory.presenter.products.electronic;

import org.example.abstract_factory.presenter.Product;

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
