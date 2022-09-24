package flyweight;

public class Bullet {
    private String color;

    public Bullet(String color) {
        this.color = color;
    }

    private Bullet() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
