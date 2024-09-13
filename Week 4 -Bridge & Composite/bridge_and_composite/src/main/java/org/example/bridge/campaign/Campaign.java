package org.example.bridge.campaign;

public abstract class Campaign {

    protected Promotion promotion;

    public Campaign(Promotion promotion) {
        this.promotion = promotion;
    }

    public void changePromotion(Promotion promotion){
        this.promotion = promotion;
    }

    protected abstract void run();
}
