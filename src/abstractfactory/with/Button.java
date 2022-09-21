package abstractfactory.with;

public class Button implements UIElement {
    private String color;
    private boolean border;
    private OS style;

    public Button(String color, boolean border, OS style) {
        this.color = color;
        this.border = border;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public boolean isBorder() {
        return border;
    }

    public OS getStyle() {
        return style;
    }

    public void click() {
        // does something;
    }

    @Override
    public void render() {
        System.out.println("Rendering button in " + style);
    }
}
