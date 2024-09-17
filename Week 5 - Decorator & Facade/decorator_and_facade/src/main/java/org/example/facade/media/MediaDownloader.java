package org.example.facade.media;

public class MediaDownloader {
    private FileDownloader fileDownloader;
    private MP3Encoder mp3Encoder;

    public MediaDownloader(FileDownloader fileDownloader, MP3Encoder mp3Encoder) {
        this.fileDownloader = fileDownloader;
        this.mp3Encoder = mp3Encoder;
    }

    public String donwloadMP3(String url) {
        String[] split = url.split("/");
        String fileName = split[split.length - 1];
        String file = fileDownloader.download(url, fileName);
        boolean encode = mp3Encoder.encode(file);
        return encode ? file : "";
    }
}
