package abstractfactory.with;

import java.util.List;

public class Window implements UIElement {
    private OS style;

    private List<UIElement> uiElements;

    public Window(List<UIElement> uiElements, OS currentOS) {
        this.uiElements = uiElements;
        this.style = currentOS;
    }

    @Override
    public void render() {
        System.out.println("Rendering window in " + style);
        for(UIElement uiElement: uiElements) {
            uiElement.render();
        }
    }
}
