package abstractfactory.with;

import java.util.Arrays;

public class MacUIWindowFactory implements UIWindowFactory {
    public static Window createWindow() {
        Window window = new Window(Arrays.asList(ButtonFactory.createButton(OS.MAC), TextBoxFactory.createTextBox(OS.MAC)),
                OS.MAC);
        return window;
    }
}
