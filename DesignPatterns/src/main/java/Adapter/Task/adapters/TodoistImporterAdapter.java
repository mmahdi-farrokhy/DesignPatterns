package Adapter.Task.adapters;

import Adapter.Task.Task;
import Adapter.Task.TaskImporter;
import Adapter.Task.apis.TodoistAPI;
import Adapter.Task.tasks.TodoistTask;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class TodoistImporterAdapter implements TaskImporter {
    private TodoistAPI todoistAPI;

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
