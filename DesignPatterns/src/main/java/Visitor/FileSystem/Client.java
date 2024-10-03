package Visitor.FileSystem;

import Visitor.FileSystem.files.File;
import Visitor.FileSystem.visitors.PrintVisitor;

public class Client {
    public void printFile(File file) {
        file.visit(new PrintVisitor());
    }
}
