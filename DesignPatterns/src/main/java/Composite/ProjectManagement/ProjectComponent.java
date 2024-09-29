package Composite.ProjectManagement;

public interface ProjectComponent { // task or a group of tasks
    void done();

    void delete();

    void duplicate();

    void move();
}
