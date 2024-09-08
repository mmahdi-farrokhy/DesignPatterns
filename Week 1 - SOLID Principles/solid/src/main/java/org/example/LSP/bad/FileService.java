package org.example.LSP.bad;

import org.example.LSP.good.IFile;
import org.example.LSP.good.IFileWithOwner;

public class FileService {
    public void execute(IFile file) {
        if (file instanceof LocalFile) {
            throw new Error("Local file not supported");
        }

        file.move("Somewhere in the middle");
    }

    public void execute(IFileWithOwner file) {
        file.move("Somewhere in the middle");
        file.changeOwner("Someone in the middle");
//        file.changePermission();
    }
}
