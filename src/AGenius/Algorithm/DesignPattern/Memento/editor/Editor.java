package AGenius.Algorithm.DesignPattern.Memento.editor;

import AGenius.Algorithm.DesignPattern.Composite.shapes.CompoundShape;
import AGenius.Algorithm.DesignPattern.Memento.history.History;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

public class Editor extends JComponent {

    private Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShapes;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo())
            canvas.repaint();
    }

    public void redo() {
        if (history.redo())
            canvas.repaint();
    }
}
