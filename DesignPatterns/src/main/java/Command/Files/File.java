package Command.Files;

import java.util.Date;

public class File {
    private String name;
    private String path;
    private String extension;
    private int size;
    private Date creationDate;
    private String content;

    public File(String name, String path, String extension, int size, Date creationDate, String content) {
        this.name = name;
        this.path = path;
        this.extension = extension;
        this.size = size;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getContent() {
        return content;
    }
}
