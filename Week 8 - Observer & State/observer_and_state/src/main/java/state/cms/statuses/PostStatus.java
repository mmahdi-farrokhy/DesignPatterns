package state.cms.statuses;

import state.cms.Post;

public abstract class PostStatus {
    protected Post post;

    public void setPost(Post post) {
        this.post = post;
    }

    public abstract void draft();

    public abstract void published();

    public abstract void moderation();
}
