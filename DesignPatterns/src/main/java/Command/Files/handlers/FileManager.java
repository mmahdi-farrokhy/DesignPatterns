package Command.Files.handlers;

import Command.Files.commands.RemoveFileCommand;
import Command.Files.commands.SaveFileCommand;

public class FileManager {
    public void save(SaveFileCommand saveCommand) {
        System.out.println("Saving file");
    }

    public void remove(RemoveFileCommand removeCommand) {
        System.out.println("Removing file");
    }
}
