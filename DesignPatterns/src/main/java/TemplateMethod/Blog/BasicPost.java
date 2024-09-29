package TemplateMethod.Blog;

public class BasicPost extends Post {
    @Override
    protected void draft() {
        System.out.println("BasicPost - draft(): A post with text and image");
    }

    @Override
    protected void review() {
        System.out.println("BasicPost - review(): Review this basic post");
    }
}
