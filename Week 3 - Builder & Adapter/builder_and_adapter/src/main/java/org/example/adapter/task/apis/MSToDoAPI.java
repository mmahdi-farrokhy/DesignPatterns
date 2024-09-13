package org.example.adapter.task.apis;

import org.example.adapter.task.tasks.MSToDoTask;

public class MSToDoAPI {
    public MSToDoTask[] getTasks() {
        return new MSToDoTask[]{
                new MSToDoTask("Task1", "Description1", "Status1"),
                new MSToDoTask("Task2", "Description2", "Status2"),
                new MSToDoTask("Task3", "Description3", "Status3")
        };
    }
}
