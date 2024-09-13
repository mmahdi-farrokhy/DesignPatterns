package org.example.composite.menu;

public class MenuItem implements MenuComponent {
    private String url;
    private String title;

    public MenuItem(String url, String title) {
        this.url = url;
        this.title = title;
    }

    @Override
    public String build() {
        return String.format("<li><a href=\"%s\">%s</a></li>", url, title);
    }
}
