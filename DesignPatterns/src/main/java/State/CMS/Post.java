package State.CMS;

import State.CMS.statuses.DraftStatus;
import State.CMS.statuses.PostStatus;

public class Post {
    private String title;
    private String content;
    private PostStatus status;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = new DraftStatus();
    }

    public void transitTo(PostStatus status) {
        this.status = status;
        this.status.setPost(this);
    }

    public void draft() {
        this.status.draft();
    }

    public void publish() {
        this.status.published();
    }

    public void moderate() {
        this.status.moderation();
    }
}
