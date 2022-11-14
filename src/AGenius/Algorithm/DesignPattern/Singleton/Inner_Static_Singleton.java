package AGenius.Algorithm.DesignPattern.Singleton;

public class Inner_Static_Singleton {

    // private inner static class, will be loaded after Inner_Static_singleton class is loaded
    // Worked as lazy init and naturally thread safe because JVM class Loader
    private static class Inner_class_Instance {
        private static final Inner_Static_Singleton instance = new Inner_Static_Singleton();
    }

    private Inner_Static_Singleton() {}

    public static  Inner_Static_Singleton getInstance() {
        return Inner_class_Instance.instance;
    }
}
