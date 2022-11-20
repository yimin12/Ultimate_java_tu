package AGenius.Algorithm.DesignPattern.Memento.history;

import AGenius.Algorithm.DesignPattern.Memento.editor.Editor;

public class Memento {

    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}