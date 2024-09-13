package org.example.adapter.task.adapters;

import org.example.adapter.task.Task;
import org.example.adapter.task.TaskImporter;
import org.example.adapter.task.apis.TodoistAPI;
import org.example.adapter.task.tasks.TodoistTask;

import java.util.Arrays;
import java.util.List;

public class TodoistImporterAdapter implements TaskImporter {
    private TodoistAPI todoistAPI;

    public TodoistImporterAdapter(TodoistAPI todoistAPI) {
        this.todoistAPI = todoistAPI;
    }

    @Override
    public List<Task> importTasks() {
        TodoistTask[] todoistTasks = todoistAPI.fetchTasks();

        return Arrays.stream(todoistTasks)
                .map(todoistTask ->
                        new Task(todoistTask.getTitle(),
                                todoistTask.getDescription(),
                                todoistTask.getStatus()))
                .toList();
    }
}
