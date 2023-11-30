package hus.oop.lab9.observer_pattern.bai_1;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
