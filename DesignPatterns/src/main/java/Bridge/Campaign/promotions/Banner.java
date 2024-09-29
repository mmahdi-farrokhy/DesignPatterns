package Bridge.Campaign.promotions;

import Bridge.Campaign.Promotion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Banner implements Promotion {
    private String title;
    private String url;
    private String imageUrl;

    @Override
    public String display() {
        return "<a href=\"" + url + "\"><img src=\"" + imageUrl + "\" alt=\"" + title + "\"/></a>";
    }
}
