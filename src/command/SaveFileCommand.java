package command;

public class SaveFileCommand implements Command {
    private EditorService editorService;
    private Editor editor;

    public SaveFileCommand(EditorService editorService, Editor editor) {
        this.editorService = editorService;
        this.editor = editor;
    }


    @Override
    public void execute() {
        this.editorService.saveFile(this.editor.getEditorText());
    }
}
