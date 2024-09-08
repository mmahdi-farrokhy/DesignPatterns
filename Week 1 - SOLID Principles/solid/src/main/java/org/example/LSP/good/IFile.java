package org.example.LSP.good;

public interface IFile {
    void rename(String newName);

    void copy(String path);

    void move(String path);
}
