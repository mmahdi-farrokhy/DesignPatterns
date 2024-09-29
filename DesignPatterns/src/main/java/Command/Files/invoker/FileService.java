package Command.Files.invoker;

import Command.Files.commands.FileCommand;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class FileService {
    private FileCommand command;

    public void save() {
        command.execute();
    }

    public void remove() {
        command.execute();
    }
}
