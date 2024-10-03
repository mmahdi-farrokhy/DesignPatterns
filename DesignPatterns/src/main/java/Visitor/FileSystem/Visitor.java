package Visitor.FileSystem;

import Visitor.FileSystem.files.Directory;
import Visitor.FileSystem.files.File;

public interface Visitor {
    public void visitFile(File file);

    public void visitDirectory(Directory directory);
}
