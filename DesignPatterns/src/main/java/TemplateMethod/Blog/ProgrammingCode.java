package TemplateMethod.Blog;

public class ProgrammingCode extends Post {
    @Override
    protected void draft() {
        System.out.println("ProgrammingCode - draft(): A post with code snippets");
    }

    @Override
    protected void review() {
        System.out.println("ProgrammingCode - review(): Review this programming post");
    }
}
