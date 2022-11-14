package AGenius.Algorithm.DesignPattern.AbstractFactory.factories;

import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.MacOSButton;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
