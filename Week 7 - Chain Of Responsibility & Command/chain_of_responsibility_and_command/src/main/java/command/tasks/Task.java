package command.tasks;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static String get(String field) {
        return "";
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
