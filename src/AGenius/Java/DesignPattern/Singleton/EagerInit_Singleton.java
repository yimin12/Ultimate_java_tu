package AGenius.Java.DesignPattern.Singleton;

public class EagerInit_Singleton {

    // Eager init
    private static EagerInit_Singleton instance = new EagerInit_Singleton();

    private EagerInit_Singleton () {}

    public static EagerInit_Singleton getInstance() {
        return instance;
    }
}
