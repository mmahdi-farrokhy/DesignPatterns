package org.example.abstract_factory.presenter.products.physical;

import org.example.abstract_factory.presenter.Presenter;

public class PhysicalPresenter implements Presenter {
    @Override
    public String present() {
        return "This is an physical product.";
    }
}
