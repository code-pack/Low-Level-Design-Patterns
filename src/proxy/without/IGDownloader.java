package proxy.without;

/**
 * 3rd Party Class - We can't modify
 */
public class IGDownloader implements Downloader {
    @Override
    public void downloadImage(String imagePath, String outputPath) {
        // Makes HTTP request to the imagePath and then uses File I/O to add the file on output Path
        System.out.println("Downloading " + imagePath + " and adding it to " + outputPath);
    }
}
