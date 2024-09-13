package org.example.composite.projectmanagement;

public interface ProjectComponent { // task or a group of tasks
    void done();

    void delete();

    void duplicate();

    void move();
}
