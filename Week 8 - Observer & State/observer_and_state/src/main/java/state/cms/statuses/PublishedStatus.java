package state.cms.statuses;

public class PublishedStatus extends PostStatus {
    @Override
    public void draft() {
        post.transitTo(new DraftStatus());
    }

    @Override
    public void published() {
        throw new Error("Post is already published.");
    }

    @Override
    public void moderation() {
        throw new Error("Published post could only get back to draft, not moderation.");
    }
}
