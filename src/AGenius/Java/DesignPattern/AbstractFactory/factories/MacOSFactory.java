package AGenius.Java.DesignPattern.AbstractFactory.factories;

import AGenius.Java.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Java.DesignPattern.AbstractFactory.buttons.MacOSButton;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.MacOSCheckbox;

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
