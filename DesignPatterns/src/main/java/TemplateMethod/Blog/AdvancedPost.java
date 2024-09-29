package TemplateMethod.Blog;

public class AdvancedPost extends Post {
    @Override
    protected void draft() {
        System.out.println("ProgrammingCode - draft(): A post with code snippets, text and image");
    }

    @Override
    protected void review() {
        System.out.println("ProgrammingCode - review(): Review this advanced post");
    }
}
