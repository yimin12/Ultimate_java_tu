package AGenius.Java.DesignPattern.FactoryMethod;

import AGenius.Java.DesignPattern.FactoryMethod.factory.Dialog;
import AGenius.Java.DesignPattern.FactoryMethod.factory.HtmlDialog;
import AGenius.Java.DesignPattern.FactoryMethod.factory.WindowsDialog;

public class App {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
