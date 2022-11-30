package AGenius.Java.DesignPattern.Command.commands;

import AGenius.Java.DesignPattern.Command.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
