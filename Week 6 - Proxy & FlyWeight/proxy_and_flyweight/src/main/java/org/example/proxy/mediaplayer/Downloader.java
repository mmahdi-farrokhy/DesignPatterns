package org.example.proxy.mediaplayer;

import java.util.Optional;

public interface Downloader {
    Optional<String> download(String url);
}
