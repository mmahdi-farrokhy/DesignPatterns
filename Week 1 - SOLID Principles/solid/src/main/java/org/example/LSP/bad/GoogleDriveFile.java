package org.example.LSP.bad;

public class GoogleDriveFile implements IFile {
    @Override
    public void rename(String newName) {
        System.out.println("Renamed to " + newName);
    }

    @Override
    public void copy(String path) {
        System.out.println("Copied to " + path);
    }

    @Override
    public void move(String path) {
        System.out.println("Moved to " + path);
    }

    @Override
    public void changeOwner(String owner) {

    }
}
