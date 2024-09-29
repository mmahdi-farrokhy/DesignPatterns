package Bridge.Campaign;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Campaign {

    protected Promotion promotion;

    public void changePromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    protected abstract void run();
}
