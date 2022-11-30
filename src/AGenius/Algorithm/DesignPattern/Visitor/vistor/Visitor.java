package AGenius.Algorithm.DesignPattern.Visitor.vistor;

import AGenius.Algorithm.DesignPattern.Visitor.shapes.Circle;
import AGenius.Algorithm.DesignPattern.Visitor.shapes.CompoundShape;
import AGenius.Algorithm.DesignPattern.Visitor.shapes.Dot;
import AGenius.Algorithm.DesignPattern.Visitor.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
