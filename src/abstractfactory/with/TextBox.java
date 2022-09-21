package abstractfactory.with;

public class TextBox implements UIElement {
    private String text;

    private String color;

    private OS style;

    public TextBox(String text, String color, OS style) {
        this.text = text;
        this.color = color;
        this.style = style;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextBox in " + style);
    }
}
