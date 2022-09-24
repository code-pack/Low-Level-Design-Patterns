package command;

public class Editor {

    private TextBox openFileTextBox;
    private TextBox editorText;
    private Button openFileButton;
    private Button saveFileButton;

    public Editor(EditorService editorService) {
        this.openFileTextBox = new TextBox();
        this.editorText = new TextBox();
        this.openFileButton = new Button(new OpenFileCommand(editorService, this), "Open");
        this.saveFileButton = new Button(new SaveFileCommand(editorService, this), "Save");
    }

    public String getOpenFilePath() {
        return this.openFileTextBox.getText();
    }

    public String getEditorText() {
        return this.editorText.getText();
    }

    public void setFilePath(String filePath) {
        this.openFileTextBox.setText(filePath);
    }

    public void setEditorText(String editorText) {
        this.editorText.setText(editorText);
    }

    public void openFile() {
        this.openFileButton.click();
    }

    public void saveFile() {
        this.saveFileButton.click();
    }
}
