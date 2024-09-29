package Solid.LSP.bad;

public interface IFile {
    void rename(String newName);

    void copy(String path);

    void move(String path);

    void changeOwner(String owner);
}
