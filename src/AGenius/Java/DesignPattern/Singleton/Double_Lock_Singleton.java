package AGenius.Java.DesignPattern.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Double_Lock_Singleton implements Serializable {

    // Lazy init
    private static Double_Lock_Singleton instance = null;

    private Double_Lock_Singleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static Double_Lock_Singleton getInstance() {
        if (instance == null) {
            Double_Lock_Singleton tmp;
            synchronized (Double_Lock_Singleton.class) {
                tmp = instance;
                if (tmp == null) {
                    synchronized (Double_Lock_Singleton.class) {
                        if (tmp == null) {
                            tmp = new Double_Lock_Singleton();
                        }
                    }
                    instance = tmp;
                }
            }
        }
        return instance;
    }

    //反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
    private Object readSolve() throws ObjectStreamException {
        return instance;
    }
}
