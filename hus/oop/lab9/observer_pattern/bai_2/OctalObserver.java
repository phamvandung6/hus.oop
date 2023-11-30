package hus.oop.lab9.observer_pattern.bai_2;

public class OctalObserver extends Observer{
    public Subject subject;
    @Override
    public void update(int state) {
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
    
}
