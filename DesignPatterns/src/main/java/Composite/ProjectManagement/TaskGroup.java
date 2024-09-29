package Composite.ProjectManagement;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TaskGroup implements ProjectComponent {
    private List<Task> tasks;

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
