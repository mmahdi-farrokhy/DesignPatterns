package Visitor.Abstract.components;

import Visitor.Abstract.Component;
import Visitor.Abstract.Visitor;

public class ComponentC implements Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitComponentC(this);
    }
}
