package Adapter.Task.tasks;

public class MSToDoTask {
    private String task;
    private String description;
    private String status;

    public MSToDoTask(String task, String description, String status) {
        this.task = task;
        this.description = description;
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
