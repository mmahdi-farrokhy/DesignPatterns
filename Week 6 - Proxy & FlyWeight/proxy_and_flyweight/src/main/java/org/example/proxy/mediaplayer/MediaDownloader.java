package org.example.proxy.mediaplayer;

import java.util.Optional;

public class MediaDownloader implements Downloader {


    @Override
    public Optional<String> download(String url) {
        return Optional.empty();
    }
}
