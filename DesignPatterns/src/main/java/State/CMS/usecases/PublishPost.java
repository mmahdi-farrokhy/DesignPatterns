package State.CMS.usecases;

import State.CMS.Post;

public class PublishPost {
    public void execute() {
        Post post = new Post("Simple Title", "Simple Body");
        post.publish();
    }
}
