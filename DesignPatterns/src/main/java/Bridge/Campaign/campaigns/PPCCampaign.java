package Bridge.Campaign.campaigns;

import Bridge.Campaign.Campaign;
import Bridge.Campaign.Promotion;

public class PPCCampaign extends Campaign {


    public PPCCampaign(Promotion promotion) {
        super(promotion);
    }

    @Override
    protected void run() {
        System.out.println(promotion.display());
    }
}
