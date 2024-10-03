package Visitor.FileSystem.files;

import Visitor.FileSystem.FileSystem;
import Visitor.FileSystem.Visitor;

public class Directory implements FileSystem {
    @Override
    public void visit(Visitor visitor) {
        visitor.visitDirectory(this);
    }
}
