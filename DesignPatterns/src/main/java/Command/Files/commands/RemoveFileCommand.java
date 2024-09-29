package Command.Files.commands;

import Command.Files.File;
import Command.Files.handlers.FileManager;

public class RemoveFileCommand implements FileCommand {
    private FileManager fileManager;
    private File file;

    public RemoveFileCommand(FileManager fileManager, File file) {
        this.fileManager = fileManager;
        this.file = file;
    }

    @Override
    public void execute() {
        fileManager.remove(this);
    }

    public File getFile() {
        return file;
    }
}
