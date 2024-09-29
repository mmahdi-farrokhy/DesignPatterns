package Adapter.Task.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoistTask {
    private String title;
    private String description;
    private String status;
}
