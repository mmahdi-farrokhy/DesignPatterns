package Visitor.FileSystem.visitors;

import Visitor.FileSystem.Visitor;
import Visitor.FileSystem.files.Directory;
import Visitor.FileSystem.files.File;

public class SizeVisitor implements Visitor {
    @Override
    public void visitFile(File file) {
        System.out.println("Size of file");
    }

    @Override
    public void visitDirectory(Directory directory) {
        System.out.println("Size of directory");
    }
}
