package AGenius.Algorithm.DesignPattern.Observer;

import AGenius.Algorithm.DesignPattern.Observer.editor.Editor;
import AGenius.Algorithm.DesignPattern.Observer.listeners.EmailNotificationListener;
import AGenius.Algorithm.DesignPattern.Observer.listeners.LogOpenListener;

public class App {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("michael@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
