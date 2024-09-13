package org.example.bridge.campaign.campaigns;

import org.example.bridge.campaign.Campaign;
import org.example.bridge.campaign.Promotion;

public class PaperViewCampaign extends Campaign {
    public PaperViewCampaign(Promotion promotion) {
        super(promotion);
    }

    @Override
    protected void run() {
        System.out.println(promotion.display());
    }
}
