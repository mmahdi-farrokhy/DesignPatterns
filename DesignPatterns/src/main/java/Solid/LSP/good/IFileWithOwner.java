package Solid.LSP.good;

public interface IFileWithOwner extends IFile {
    void changeOwner(String owner);
}
