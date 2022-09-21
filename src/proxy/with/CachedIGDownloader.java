package proxy.with;

import java.util.HashMap;
import java.util.Map;

public class CachedIGDownloader implements Downloader {
    private Downloader downloader;
    private Map<String, Boolean> cached;

    public CachedIGDownloader(Downloader downloader) {
        this.cached = new HashMap<>();
        this.downloader = downloader;
    }

    @Override
    public void downloadImage(String imagePath, String outputPath) {
        if (!cached.containsKey(imagePath)) {
            downloader.downloadImage(imagePath, outputPath);
            cached.put(imagePath, true);
        }
        else {
            System.out.println("Not downloading " + imagePath + " as it is already cached!");
        }
    }
}
