package TemplateMethod.Blog;

public abstract class Post {
    public void create() {
        draft();
        review();
    }

    protected abstract void draft();

    protected abstract void review();
}
