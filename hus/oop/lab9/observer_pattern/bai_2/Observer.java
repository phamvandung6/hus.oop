package hus.oop.lab9.observer_pattern.bai_2;

public abstract class Observer {
    public Subject subject;

    public abstract void update(int state); 
}
