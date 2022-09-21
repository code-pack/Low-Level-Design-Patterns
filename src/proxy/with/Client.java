package proxy.with;

public class Client {
    public static void main(String[] args) {
        Displayer displayer = new Displayer(new CachedIGDownloader(new IGDownloader()));
        displayer.render("1.jpg");
        displayer.render("2.jpg");
        displayer.render("1.jpg");
    }
}
