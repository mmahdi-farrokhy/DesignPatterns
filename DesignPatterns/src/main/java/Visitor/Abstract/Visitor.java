package Visitor.Abstract;

import Visitor.Abstract.components.ComponentA;
import Visitor.Abstract.components.ComponentB;
import Visitor.Abstract.components.ComponentC;

public interface Visitor {
    public void visitComponentA(ComponentA componentA);

    public void visitComponentB(ComponentB componentB);

    public void visitComponentC(ComponentC componentC);
}
