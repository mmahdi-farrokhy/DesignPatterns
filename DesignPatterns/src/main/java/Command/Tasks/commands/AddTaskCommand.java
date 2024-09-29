package Command.Tasks.commands;

import Command.Tasks.handlers.AddTaskHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddTaskCommand implements Command {
    private String title;
    private String description;
    private AddTaskHandler handler;

    @Override
    public void execute() {
        handler.execute(this);
    }
}
