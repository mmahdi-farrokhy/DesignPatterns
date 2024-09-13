package org.example.bridge.campaign.promotions;

import org.example.bridge.campaign.Promotion;

public class Text implements Promotion {
    private String title;
    private String link;

    public Text(String title, String link) {
        this.title = title;
        this.link = link;
    }

    @Override
    public String display() {
        return "<a href=\"" + link + "\">" + title + "</a>";
    }
}
