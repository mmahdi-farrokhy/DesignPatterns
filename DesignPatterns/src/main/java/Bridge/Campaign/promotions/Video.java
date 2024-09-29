package Bridge.Campaign.promotions;

import Bridge.Campaign.Promotion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Video implements Promotion {
    private String fileUrl;

    @Override
    public String display() {
        return "<video src=\"" + fileUrl + "\" controls></video>\n";
    }
}
