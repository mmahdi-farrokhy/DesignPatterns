package command.files.invoker;

import command.files.commands.FileCommand;

public class FileService {
    private FileCommand command;

    public FileService(FileCommand command) {
        this.command = command;
    }

    public void setCommand(FileCommand command) {
        this.command = command;
    }

    public void save() {
        command.execute();
    }

    public void remove() {
        command.execute();
    }
}
