package memento;

public class Editor {
    private String text;
    private String formattingOptions;
    private int cursorX;
    private int cursorY;

    public Editor(String text, String formattingOptions, int cursorX, int cursorY) {
        this.text = text;
        this.formattingOptions = formattingOptions;
        this.cursorX = cursorX;
        this.cursorY = cursorY;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFormattingOptions() {
        return formattingOptions;
    }

    public void setFormattingOptions(String formattingOptions) {
        this.formattingOptions = formattingOptions;
    }

    public int getCursorX() {
        return cursorX;
    }

    public void setCursorX(int cursorX) {
        this.cursorX = cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public void setCursorY(int cursorY) {
        this.cursorY = cursorY;
    }

    public class EditorSnapshot {
        private Editor editor;
        private String text;
        private String formattingOptions;
        private int cursorX;
        private int cursorY;

        public EditorSnapshot(Editor editor, String text, String formattingOptions, int cursorX, int cursorY) {
            this.editor = editor;
            this.text = text;
            this.formattingOptions = formattingOptions;
            this.cursorX = cursorX;
            this.cursorY = cursorY;
        }

        public String getText() {
            return text;
        }

        public String getFormattingOptions() {
            return formattingOptions;
        }

        public int getCursorX() {
            return cursorX;
        }

        public int getCursorY() {
            return cursorY;
        }

        public void restore() {
            this.editor.setText(this.text);
            this.editor.setFormattingOptions(this.formattingOptions);
            this.editor.setCursorX(this.cursorX);
            this.editor.setCursorY(this.cursorY);
        }
    }

    public EditorSnapshot createSnapshot() {
        return new EditorSnapshot(this, this.text, this.formattingOptions, this.cursorX, this.cursorY);
    }
}
