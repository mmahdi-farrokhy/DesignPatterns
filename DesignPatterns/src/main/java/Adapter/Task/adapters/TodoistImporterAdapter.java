package Adapter.Task.adapters;

import Adapter.Task.Task;
import Adapter.Task.TaskImporter;
import Adapter.Task.apis.TodoistAPI;
import Adapter.Task.tasks.TodoistTask;

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
