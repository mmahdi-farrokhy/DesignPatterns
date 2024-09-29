package Bridge.Campaign.promotions;

import Bridge.Campaign.Promotion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Text implements Promotion {
    private String title;
    private String link;

    @Override
    public String display() {
        return "<a href=\"" + link + "\">" + title + "</a>";
    }
}
