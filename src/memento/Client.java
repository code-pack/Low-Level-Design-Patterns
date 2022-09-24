package memento;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor("A", "", 0, 0);
        List<Editor.EditorSnapshot> history = new ArrayList<>();

        createBackup(editor, history);
        editor.setText("B");

        System.out.println("Text of editor is " + editor.getText());

        restore(history.get(history.size() - 1));

        System.out.println("Text of editor (after restoration) is " + editor.getText());


    }

    public static void createBackup(Editor editor, List<Editor.EditorSnapshot> history) {
        history.add(editor.createSnapshot());
    }

    public static void restore(Editor.EditorSnapshot snapshot) {
        snapshot.restore();
    }
}
