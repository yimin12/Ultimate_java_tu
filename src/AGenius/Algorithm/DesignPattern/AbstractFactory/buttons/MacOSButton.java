package AGenius.Algorithm.DesignPattern.AbstractFactory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
