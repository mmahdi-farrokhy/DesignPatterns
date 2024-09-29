package Command.Files.commands;

import Command.Files.File;
import Command.Files.handlers.FileManager;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RemoveFileCommand implements FileCommand {
    private FileManager fileManager;
    private File file;

    @Override
    public void execute() {
        fileManager.remove(this);
    }
}
