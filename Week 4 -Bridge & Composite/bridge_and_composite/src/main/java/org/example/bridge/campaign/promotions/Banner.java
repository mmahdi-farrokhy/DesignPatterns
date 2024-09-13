package org.example.bridge.campaign.promotions;

import org.example.bridge.campaign.Promotion;

public class Banner implements Promotion {
    private String title;
    private String url;
    private String imageUrl;

    public Banner(String title, String url, String imageUrl) {
        this.title = title;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    @Override
    public String display() {
        return "<a href=\"" + url + "\"><img src=\"" + imageUrl + "\" alt=\"" + title + "\"/></a>";
    }
}
