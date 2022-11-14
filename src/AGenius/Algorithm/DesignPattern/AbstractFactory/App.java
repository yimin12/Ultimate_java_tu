package AGenius.Algorithm.DesignPattern.AbstractFactory;

import AGenius.Algorithm.DesignPattern.AbstractFactory.app.Application;
import AGenius.Algorithm.DesignPattern.AbstractFactory.factories.GUIFactory;
import AGenius.Algorithm.DesignPattern.AbstractFactory.factories.MacOSFactory;
import AGenius.Algorithm.DesignPattern.AbstractFactory.factories.WindowsFactory;

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
