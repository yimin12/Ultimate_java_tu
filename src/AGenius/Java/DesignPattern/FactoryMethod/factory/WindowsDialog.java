package AGenius.Java.DesignPattern.FactoryMethod.factory;

import AGenius.Java.DesignPattern.FactoryMethod.buttons.Button;
import AGenius.Java.DesignPattern.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
