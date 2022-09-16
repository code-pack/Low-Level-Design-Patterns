package builder.without;

public class Button {
    private Border leftBorder;
    private Border rightBorder;
    private Border topBorder;
    private Border bottomBorder;
    private double borderRadius;

    private String backgroundColor;

    public Button(Border leftBorder, Border rightBorder, Border topBorder, Border bottomBorder, double borderRadius,
                  String backgroundColor) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.topBorder = topBorder;
        this.bottomBorder = bottomBorder;
        this.borderRadius = borderRadius;
        this.backgroundColor = backgroundColor;
    }

    public void click() {
        System.out.println("I am clicked!");
    }
}
