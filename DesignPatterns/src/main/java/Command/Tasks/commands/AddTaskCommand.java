package Command.Tasks.commands;

import Command.Tasks.handlers.AddTaskHandler;

public class AddTaskCommand implements Command {
    private String title;
    private String description;
    private AddTaskHandler handler;

    public AddTaskCommand(String title, String description, AddTaskHandler handler) {
        this.title = title;
        this.description = description;
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.execute(this);
    }
}
