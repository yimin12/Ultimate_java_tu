package AGenius.Java.DesignPattern.AbstractFactory.factories;

import AGenius.Java.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Java.DesignPattern.AbstractFactory.buttons.WindowsButton;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
