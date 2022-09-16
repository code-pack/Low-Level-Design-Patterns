package builder.with;

public class Border {
    private int width;
    private String color;

    private Border() {

    }

    private Border(BorderBuilder borderBuilder) {
        this.width = borderBuilder.width;
        this.color = borderBuilder.color;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public static BorderBuilder builder() {
        return new BorderBuilder();
    }

    public static class BorderBuilder {
        private int width;
        private String color;


        public BorderBuilder() {
            width = 1;
            color = "#000000";
        }

        public BorderBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public BorderBuilder withWidth(int width) {
            this.width = width;
            return this;
        }

        public Border build() {
            return new Border(this);
        }
    }
}
