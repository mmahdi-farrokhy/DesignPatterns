package State.CMS.statuses;

public class DraftStatus extends PostStatus {
    @Override
    public void draft() {
        post.transitTo(new DraftStatus());
    }

    @Override
    public void published() {
        throw new Error("Content must be approved before testing");
    }

    @Override
    public void moderation() {
        post.transitTo(new ModerationStatus());
    }
}
