package proxy.without;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Displayer displayer = new Displayer(new IGDownloader());
        displayer.render("1.jpg");
        displayer.render("2.jpg");
        displayer.render("1.jpg");
    }
}
