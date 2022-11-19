package AGenius.Algorithm.DesignPattern.Flyweight.trees;

import java.awt.*;

public class Tree {

    private int x, y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
