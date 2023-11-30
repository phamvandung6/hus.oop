package hus.oop.lab9.observer_pattern.bai_2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject() {
        this.observers = new ArrayList<>();
        this.state = 0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    };

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }   
}
