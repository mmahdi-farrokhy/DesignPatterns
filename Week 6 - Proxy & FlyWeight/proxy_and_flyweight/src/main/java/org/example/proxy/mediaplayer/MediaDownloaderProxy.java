package org.example.proxy.mediaplayer;

import java.util.Optional;

public class MediaDownloaderProxy implements Downloader {
    private final Downloader downloader;
    private final LocalFileService localFileService;

    public MediaDownloaderProxy(Downloader downloader, LocalFileService localFileService) {
        this.downloader = downloader;
        this.localFileService = localFileService;
    }

    @Override
    public Optional<String> download(String url) {
        String[] split = url.split("/");
        String fileName = split[split.length - 1];

        if (localFileService.exists(fileName)) {
            return localFileService.findFilePath(fileName);
        }

        return downloader.download(url);
    }
}
