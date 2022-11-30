package AGenius.Java.DesignPattern.FactoryMethod.factory;

import AGenius.Java.DesignPattern.FactoryMethod.buttons.Button;
import AGenius.Java.DesignPattern.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
