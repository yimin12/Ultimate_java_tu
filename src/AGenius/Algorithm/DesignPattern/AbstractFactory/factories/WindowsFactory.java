package AGenius.Algorithm.DesignPattern.AbstractFactory.factories;

import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.WindowsButton;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.Checkbox;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.WindowsCheckbox;

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
