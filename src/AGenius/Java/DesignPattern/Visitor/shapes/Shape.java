package AGenius.Java.DesignPattern.Visitor.shapes;

import AGenius.Java.DesignPattern.Visitor.vistor.Visitor;

public interface Shape {

    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);

}
