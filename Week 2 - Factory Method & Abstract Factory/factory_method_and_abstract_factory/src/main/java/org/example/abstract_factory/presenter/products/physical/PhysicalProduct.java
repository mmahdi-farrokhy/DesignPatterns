package org.example.abstract_factory.presenter.products.physical;

import org.example.abstract_factory.presenter.Product;

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
