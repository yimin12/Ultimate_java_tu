package AGenius.Java.DesignPattern.Visitor.vistor;

import AGenius.Java.DesignPattern.Visitor.shapes.Circle;
import AGenius.Java.DesignPattern.Visitor.shapes.CompoundShape;
import AGenius.Java.DesignPattern.Visitor.shapes.Dot;
import AGenius.Java.DesignPattern.Visitor.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
