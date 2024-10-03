package Visitor.FileSystem.files;


import Visitor.FileSystem.FileSystem;
import Visitor.FileSystem.Visitor;

public class File implements FileSystem {
    @Override
    public void visit(Visitor visitor) {
        visitor.visitFile(this);
    }
}
