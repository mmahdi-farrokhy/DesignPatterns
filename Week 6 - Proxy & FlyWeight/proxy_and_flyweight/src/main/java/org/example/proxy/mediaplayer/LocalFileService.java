package org.example.proxy.mediaplayer;

import java.util.Optional;

public interface LocalFileService {
    boolean exists(String filePath);

    Optional<String> findFilePath(String fileName);
}
