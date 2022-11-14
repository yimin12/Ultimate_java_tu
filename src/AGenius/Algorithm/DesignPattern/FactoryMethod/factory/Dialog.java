package AGenius.Algorithm.DesignPattern.FactoryMethod.factory;

import AGenius.Algorithm.DesignPattern.FactoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
