package Command.Files;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class File {
    private String name;
    private String path;
    private String extension;
    private int size;
    private Date creationDate;
    private String content;
}
