package Composite.Concept;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Composite implements Component {
    private List<Component> components;

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
