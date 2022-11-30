package AGenius.Java.DesignPattern.AbstractFactory;

import AGenius.Java.DesignPattern.AbstractFactory.app.Application;
import AGenius.Java.DesignPattern.AbstractFactory.factories.GUIFactory;
import AGenius.Java.DesignPattern.AbstractFactory.factories.MacOSFactory;
import AGenius.Java.DesignPattern.AbstractFactory.factories.WindowsFactory;

public class App {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
