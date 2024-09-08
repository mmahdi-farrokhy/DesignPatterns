package org.example.LSP.bad;

public class LocalFile implements IFile {
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
        System.out.println("Changed owner to " + owner);
    }

    public void changePermission() {
        System.out.println("Permission changed");
    }
}
