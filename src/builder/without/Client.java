package builder.without;

public class Client {

    public static void main(String[] args) {
        Button a = new Button(new Border(2, "#00FF00"),
                new Border(1, "#0FFF00"),
                new Border(2, "00FF00"),
                new Border(1, "#0FFF00"),
                1.2, "FFFFFF");

        Button b = new Button(new Border(4, "#00FFF0"),
                new Border(3, "#0FFFF0"),
                new Border(4, "00FFF0"),
                new Border(3, "#0FFFF0"),
                1.5, "FFFFFF");

        a.click();
        b.click();
    }
}
