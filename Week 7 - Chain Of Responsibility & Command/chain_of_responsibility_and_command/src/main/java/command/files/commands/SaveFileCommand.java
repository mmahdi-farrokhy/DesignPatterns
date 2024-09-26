package command.files.commands;

import command.files.File;
import command.files.handlers.FileManager;

public class SaveFileCommand implements FileCommand {
    private FileManager fileManager;
    private File file;

    public SaveFileCommand(FileManager fileManager, File file) {
        this.fileManager = fileManager;
        this.file = file;
    }

    @Override
    public void execute() {
        fileManager.save(this);
    }

    public File getFile() {
        return file;
    }
}
