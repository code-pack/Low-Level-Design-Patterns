package abstractfactory.with;

public class TextBoxFactory {
    public static TextBox createTextBox(OS currentOS) {
        TextBox tb = null;
        if (currentOS == OS.WINDOWS) {
            tb = new TextBox("", "#FFFFFF", currentOS);
        }
        else if (currentOS == OS.MAC) {
            tb = new TextBox("", "#000000", currentOS);
        }
        else if (currentOS == OS.LINUX) {
            tb = new TextBox("", "#0000FF", currentOS);
        }
        return tb;
    }
}
