package command;

public class Client {
    public static void main(String[] args) {
        EditorService editorService = new EditorService();
        Editor editor = new Editor(editorService);

        editor.setFilePath("/home/ps06756/a.txt");
        editor.openFile();
    }
}
