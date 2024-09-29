package Proxy.MediaPlayer;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class MediaDownloaderProxy implements Downloader {
    private final Downloader downloader;
    private final LocalFileService localFileService;

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
