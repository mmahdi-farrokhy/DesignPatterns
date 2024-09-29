package Command.Tasks.invoker;

import Command.Tasks.Task;
import Command.Tasks.commands.AddTaskCommand;
import Command.Tasks.handlers.AddTaskHandler;

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
