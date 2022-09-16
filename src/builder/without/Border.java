package builder.without;

public class Border {
    private int width;
    private String color;

    public Border(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
