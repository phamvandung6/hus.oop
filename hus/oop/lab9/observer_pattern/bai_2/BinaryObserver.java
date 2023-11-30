package hus.oop.lab9.observer_pattern.bai_2;

public class BinaryObserver extends Observer{
    public Subject subject;
    @Override
    public void update(int state) {
        System.out.println("Binary Observer: " +  Integer.toBinaryString(state));
    }
}
