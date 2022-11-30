package AGenius.Java.DesignPattern.AbstractFactory.app;

import AGenius.Java.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Java.DesignPattern.AbstractFactory.factories.GUIFactory;

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
