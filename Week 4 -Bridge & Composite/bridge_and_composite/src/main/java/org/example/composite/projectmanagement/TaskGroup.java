package org.example.composite.projectmanagement;

import java.util.List;

public class TaskGroup implements ProjectComponent {
    private List<Task> tasks;

    public TaskGroup(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void done() {
        tasks.forEach(ProjectComponent::done);
    }

    @Override
    public void delete() {
        tasks.forEach(ProjectComponent::delete);
    }

    @Override
    public void duplicate() {
        tasks.forEach(ProjectComponent::duplicate);
    }

    @Override
    public void move() {
        tasks.forEach(ProjectComponent::move);
    }
}
