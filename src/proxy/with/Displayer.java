package proxy.with;

/** 3rd Part Class */
public class Displayer {
    private Downloader downloader;

    public Displayer(Downloader downloader) {
        this.downloader = downloader;
    }

    public void render(String imagePath) {
        String outputPath = "abcd.jpg";
        downloader.downloadImage(imagePath, outputPath);
        // displaying the image on the device
    }
}
