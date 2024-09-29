package Bridge.Campaign.promotions;

import Bridge.Campaign.Promotion;

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
