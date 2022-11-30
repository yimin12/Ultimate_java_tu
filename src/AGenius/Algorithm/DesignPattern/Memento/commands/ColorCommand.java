package AGenius.Algorithm.DesignPattern.Memento.commands;

import AGenius.Algorithm.DesignPattern.Memento.editor.Editor;
import AGenius.Algorithm.DesignPattern.Memento.shapes.Shape;

import java.awt.*;


public class ColorCommand implements Command {

    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
