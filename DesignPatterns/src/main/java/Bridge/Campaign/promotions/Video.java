package Bridge.Campaign.promotions;

import Bridge.Campaign.Promotion;

public class Video implements Promotion {
    private String fileUrl;

    public Video(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String display() {
        return "<video src=\"" + fileUrl + "\" controls></video>\n";
    }
}
