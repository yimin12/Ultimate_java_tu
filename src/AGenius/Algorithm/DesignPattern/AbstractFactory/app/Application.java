package AGenius.Algorithm.DesignPattern.AbstractFactory.app;

import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Algorithm.DesignPattern.AbstractFactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
