package AGenius.Algorithm.DesignPattern.Flyweight.forest;

import AGenius.Algorithm.DesignPattern.Flyweight.trees.Tree;
import AGenius.Algorithm.DesignPattern.Flyweight.trees.TreeFactory;
import AGenius.Algorithm.DesignPattern.Flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
