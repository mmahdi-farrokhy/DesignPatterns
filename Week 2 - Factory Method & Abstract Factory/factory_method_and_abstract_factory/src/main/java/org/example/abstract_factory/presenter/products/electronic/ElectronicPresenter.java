package org.example.abstract_factory.presenter.products.electronic;

import org.example.abstract_factory.presenter.Presenter;

public class ElectronicPresenter implements Presenter {
    @Override
    public String present() {
        return "This is an electronic product.";
    }
}
