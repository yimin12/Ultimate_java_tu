package AGenius.Algorithm.DesignPattern.Singleton;

public class LazyInit_Single {

    // Lazy init
    private static LazyInit_Single instance;

    // private constructor
    private LazyInit_Single() {}

    public static synchronized LazyInit_Single getInstance() {
        if (instance == null) instance = new LazyInit_Single();
        return instance;
    }

}
