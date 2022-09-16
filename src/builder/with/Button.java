package builder.with;

public class Button {
    private Border leftBorder;
    private Border rightBorder;
    private Border topBorder;
    private Border bottomBorder;
    private double borderRadius;

    private String backgroundColor;


    private Button() {

    }

    private Button(ButtonBuilder buttonBuilder) {
        this.leftBorder = buttonBuilder.leftBorder;
        this.rightBorder = buttonBuilder.rightBorder;
        this.topBorder = buttonBuilder.topBorder;
        this.bottomBorder = buttonBuilder.bottomBorder;
        this.borderRadius = buttonBuilder.borderRadius;
        this.backgroundColor = buttonBuilder.backgroundColor;
    }

    public void click() {
        System.out.println("I am clicked!");
    }

    public static ButtonBuilder builder() {
        return new ButtonBuilder();
    }

    public static class ButtonBuilder {
        public Border leftBorder;
        public Border rightBorder;
        public Border topBorder;
        public Border bottomBorder;
        private double borderRadius;
        public String backgroundColor;

        public ButtonBuilder() {
            this.leftBorder = Border.builder().build();
            this.rightBorder = Border.builder().build();
            this.topBorder = Border.builder().build();
            this.bottomBorder = Border.builder().build();
            this.borderRadius = 0.0;
            this.backgroundColor = "#FFFFFF";
        }

        public ButtonBuilder withLeftBorder(Border leftBorder) {
            this.leftBorder = leftBorder;
            return this;
        }

        public ButtonBuilder withRightBorder(Border rightBorder) {
            this.rightBorder = rightBorder;
            return this;
        }

        public ButtonBuilder withTopBorder(Border topBorder) {
            this.topBorder = topBorder;
            return this;
        }

        public ButtonBuilder withBottomBorder(Border bottomBorder) {
            this.bottomBorder = bottomBorder;
            return this;
        }

        public ButtonBuilder withBorderRadius(double borderRadius) {
            this.borderRadius = borderRadius;
            return this;
        }

        public ButtonBuilder withBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Button build() {
            return new Button(this);
        }

    }
}
