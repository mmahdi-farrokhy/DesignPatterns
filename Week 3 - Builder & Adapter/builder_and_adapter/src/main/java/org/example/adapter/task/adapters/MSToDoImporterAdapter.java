package org.example.adapter.task.adapters;

import org.example.adapter.task.Task;
import org.example.adapter.task.TaskImporter;
import org.example.adapter.task.apis.MSToDoAPI;
import org.example.adapter.task.tasks.MSToDoTask;

import java.util.Arrays;
import java.util.List;

public class MSToDoImporterAdapter implements TaskImporter {
    private MSToDoAPI msToDoAPI;

    public MSToDoImporterAdapter(MSToDoAPI msToDoAPI) {
        this.msToDoAPI = msToDoAPI;
    }

    @Override
    public List<Task> importTasks() {
        MSToDoTask[] msToDoTasks = msToDoAPI.getTasks();

        return Arrays.stream(msToDoTasks)
                .map(msToDoTask ->
                        new Task(msToDoTask.getTask(),
                                msToDoTask.getDescription(),
                                msToDoTask.getStatus()))
                .toList();
    }
}
