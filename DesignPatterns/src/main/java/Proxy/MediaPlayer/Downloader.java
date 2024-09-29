package Proxy.MediaPlayer;

import java.util.Optional;

public interface Downloader {
    Optional<String> download(String url);
}
