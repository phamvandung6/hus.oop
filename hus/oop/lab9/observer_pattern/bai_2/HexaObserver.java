package hus.oop.lab9.observer_pattern.bai_2;

public class HexaObserver extends Observer {
    public Subject subject;

    @Override
    public void update(int state) {
        System.out.println("Hex String: " + Integer.toHexString(state));
    }

}
