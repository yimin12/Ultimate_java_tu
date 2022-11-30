package AGenius.Java.DesignPattern.AbstractFactory.factories;

import AGenius.Java.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Java.DesignPattern.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();

}
