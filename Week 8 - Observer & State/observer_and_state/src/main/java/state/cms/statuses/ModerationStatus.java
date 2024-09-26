package state.cms.statuses;

public class ModerationStatus extends PostStatus {
    @Override
    public void draft() {
        post.transitTo(new DraftStatus());
    }

    @Override
    public void published() {
        post.transitTo(new PublishedStatus());
    }

    @Override
    public void moderation() {
        post.transitTo(new ModerationStatus());
    }
}
