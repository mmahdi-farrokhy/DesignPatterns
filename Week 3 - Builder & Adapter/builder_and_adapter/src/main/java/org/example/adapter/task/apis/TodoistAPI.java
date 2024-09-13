package org.example.adapter.task.apis;

import org.example.adapter.task.tasks.TodoistTask;

public class TodoistAPI {
    public TodoistTask[] fetchTasks() {
        return new TodoistTask[]{
                new TodoistTask("Title1", "Description1", "Status1"),
                new TodoistTask("Title2", "Description2", "Status2"),
                new TodoistTask("Title3", "Description3", "Status3")
        };
    }
}
