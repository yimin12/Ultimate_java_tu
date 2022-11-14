package AGenius.Algorithm.DesignPattern.FactoryMethod.factory;

import AGenius.Algorithm.DesignPattern.FactoryMethod.buttons.Button;
import AGenius.Algorithm.DesignPattern.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
