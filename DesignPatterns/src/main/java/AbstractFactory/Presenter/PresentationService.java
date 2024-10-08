package AbstractFactory.Presenter;

public class PresentationService {
    private final Presenter presenter;

    public PresentationService(Presenter presenter) {
        this.presenter = presenter;
    }

    public String presentProduct() {
        return presenter.present();
    }
}
