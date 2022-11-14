package AGenius.Algorithm.DesignPattern.FactoryMethod.factory;

import AGenius.Algorithm.DesignPattern.FactoryMethod.buttons.Button;
import AGenius.Algorithm.DesignPattern.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
