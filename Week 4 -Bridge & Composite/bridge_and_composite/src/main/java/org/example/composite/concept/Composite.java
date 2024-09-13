package org.example.composite.concept;

import java.util.List;

public class Composite implements Component {
    private List<Component> components;

    public Composite(List<Component> components) {
        this.components = components;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }
}
