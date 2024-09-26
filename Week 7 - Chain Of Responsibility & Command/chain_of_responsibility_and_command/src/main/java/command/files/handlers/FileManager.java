package command.files.handlers;

import command.files.commands.RemoveFileCommand;
import command.files.commands.SaveFileCommand;

public class FileManager {
    public void save(SaveFileCommand saveCommand) {
        System.out.println("Saving file");
    }

    public void remove(RemoveFileCommand removeCommand) {
        System.out.println("Removing file");
    }
}
