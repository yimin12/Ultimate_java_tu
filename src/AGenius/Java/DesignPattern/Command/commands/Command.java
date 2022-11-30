package AGenius.Java.DesignPattern.Command.commands;

import AGenius.Java.DesignPattern.Command.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
