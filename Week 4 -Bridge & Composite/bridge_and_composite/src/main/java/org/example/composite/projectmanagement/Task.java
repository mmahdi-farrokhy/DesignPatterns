package org.example.composite.projectmanagement;

public class Task implements ProjectComponent {
    private String status;

    @Override
    public void done() {
        status = "done";
    }

    @Override
    public void delete() {
        status = "deleted";
    }

    @Override
    public void duplicate() {
        status = "duplicated";
    }

    @Override
    public void move() {
        status = "moved";
    }
}
