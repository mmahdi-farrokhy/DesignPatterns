package state.cms.usecases;

import state.cms.Post;

public class PublishPost {
    public void execute() {
        Post post = new Post("Simple Title", "Simple Body");
        post.publish();
    }
}
