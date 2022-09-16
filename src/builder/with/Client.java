package builder.with;

public class Client {
    public static void main(String[] args) {
        Button a = Button.builder()
                .withLeftBorder(
                        Border
                                .builder()
                                .withWidth(2)
                                .withColor("#00FF00")
                                .build()
                )
                .withRightBorder(
                        Border
                                .builder()
                                .withWidth(1)
                                .withColor("#00FFF00")
                                .build()
                )
                .withTopBorder(
                        Border
                                .builder()
                                .withWidth(2)
                                .withColor("#00FF00")
                                .build()
                )
                .withBottomBorder(
                        Border
                                .builder()
                                .withWidth(1)
                                .withColor("#00FFF00")
                                .build()
                )
                .withBorderRadius(1.2)
                .withBackgroundColor("#FFFFFF")
                .build();

        Button b = Button.builder().withBorderRadius(2.0).withBackgroundColor("#FF0000").build();


    }
}
