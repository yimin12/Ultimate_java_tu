package AGenius.Algorithm.DesignPattern.AbstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox");
    }
}
