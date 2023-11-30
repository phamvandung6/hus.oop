package hus.oop.lab9.observer_pattern.bai_1;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("src/log.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
