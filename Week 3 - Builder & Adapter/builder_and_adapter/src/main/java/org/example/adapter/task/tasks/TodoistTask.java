package org.example.adapter.task.tasks;

public class TodoistTask {
    private String title;
    private String description;
    private String status;

    public TodoistTask(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
