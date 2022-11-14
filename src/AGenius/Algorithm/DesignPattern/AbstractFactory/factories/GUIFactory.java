package AGenius.Algorithm.DesignPattern.AbstractFactory.factories;

import AGenius.Algorithm.DesignPattern.AbstractFactory.buttons.Button;
import AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();

}
