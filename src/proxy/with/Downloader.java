package proxy.with;

/**
 * 3rd Party Interface, We can't modify
 */
public interface Downloader {
    void downloadImage(String imagePath, String outputPath);
}
