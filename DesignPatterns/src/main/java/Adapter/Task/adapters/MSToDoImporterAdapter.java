package Adapter.Task.adapters;

import Adapter.Task.Task;
import Adapter.Task.TaskImporter;
import Adapter.Task.apis.MSToDoAPI;
import Adapter.Task.tasks.MSToDoTask;

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
