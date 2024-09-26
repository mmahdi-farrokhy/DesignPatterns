package command.tasks.invoker;

import command.tasks.Task;
import command.tasks.commands.AddTaskCommand;
import command.tasks.handlers.AddTaskHandler;

public class Controller {
    public void addTask(Task task) {
        AddTaskHandler handler = new AddTaskHandler();
        AddTaskCommand command =
                new AddTaskCommand(task.getTitle(),
                        task.getDescription(),
                        handler);

        command.execute();
    }
}
