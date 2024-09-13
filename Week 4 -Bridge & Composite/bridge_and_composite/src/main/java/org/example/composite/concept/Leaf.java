package org.example.composite.concept;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}
