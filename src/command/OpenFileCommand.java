package command;

public class OpenFileCommand implements Command {
    private EditorService editorService;
    private Editor editor;

    public OpenFileCommand(EditorService editorService, Editor editor) {
        this.editorService = editorService;
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editorService.openExistingFile(this.editor.getOpenFilePath());
    }
}
