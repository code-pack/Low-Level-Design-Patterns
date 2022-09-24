package command;

public class EditorService {
    void openExistingFile(String filePath) {
        System.out.println("Opening an existing file with filepath " + filePath);
    }
    void closeFile() {
        System.out.println("Closing current file!");
    }

    void saveFile(String text) {
        System.out.println("Saving the current file with text " + text);
    }
}
