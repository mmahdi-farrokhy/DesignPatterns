package Bridge.Campaign.campaigns;

import Bridge.Campaign.Campaign;
import Bridge.Campaign.Promotion;

public class PaperViewCampaign extends Campaign {
    public PaperViewCampaign(Promotion promotion) {
        super(promotion);
    }

    @Override
    protected void run() {
        System.out.println(promotion.display());
    }
}
