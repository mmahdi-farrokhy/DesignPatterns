package Composite.Menu;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuItem implements MenuComponent {
    private String url;
    private String title;

    @Override
    public String build() {
        return String.format("<li><a href=\"%s\">%s</a></li>", url, title);
    }
}
