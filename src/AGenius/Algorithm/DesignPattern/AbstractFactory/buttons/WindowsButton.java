package AGenius.Algorithm.DesignPattern.AbstractFactory.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have create WindowsButton");
    }
}
