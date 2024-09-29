package Composite.Menu;

import java.util.List;

public class MenuList implements MenuComponent {
    private List<MenuComponent> menuComponents;

    public MenuList(List<MenuComponent> menuComponents) {
        this.menuComponents = menuComponents;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String build() {
        final String[] result = {"<ul>"};
        menuComponents.forEach(menuComponent -> result[0] += menuComponent.build());
        result[0] += "</ul>";
        return result[0];
    }
}
