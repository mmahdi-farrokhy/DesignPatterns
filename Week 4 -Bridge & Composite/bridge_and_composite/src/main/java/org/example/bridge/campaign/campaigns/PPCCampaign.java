package org.example.bridge.campaign.campaigns;

import org.example.bridge.campaign.Campaign;
import org.example.bridge.campaign.Promotion;

public class PPCCampaign extends Campaign {


    public PPCCampaign(Promotion promotion) {
        super(promotion);
    }

    @Override
    protected void run() {
        System.out.println(promotion.display());
    }
}
