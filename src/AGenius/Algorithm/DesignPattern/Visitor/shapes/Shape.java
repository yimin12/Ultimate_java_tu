package AGenius.Algorithm.DesignPattern.Visitor.shapes;

import AGenius.Algorithm.DesignPattern.Visitor.vistor.Visitor;

public interface Shape {

    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);

}
