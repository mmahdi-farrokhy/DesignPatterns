package Adapter.Task.apis;

import Adapter.Task.tasks.MSToDoTask;

public class MSToDoAPI {
    public MSToDoTask[] getTasks() {
        return new MSToDoTask[]{
                new MSToDoTask("Task1", "Description1", "Status1"),
                new MSToDoTask("Task2", "Description2", "Status2"),
                new MSToDoTask("Task3", "Description3", "Status3")
        };
    }
}
