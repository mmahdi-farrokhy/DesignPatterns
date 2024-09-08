package org.example.LSP.good;

public class FileService {
    public void execute(IFile file) {
        file.move("Somewhere in the middle");
    }

    public void execute(IFileWithOwner file) {
        file.move("Somewhere in the middle");
        file.changeOwner("Someone in the middle");
    }
}
