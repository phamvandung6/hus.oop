package hus.oop.lab9.observer_pattern.bai_2;

public class ObserverPatternDemo {
  public static void main(String[] args) {
    Subject subject = new Subject();
    
    Observer binaryObserver = new BinaryObserver();
    Observer hexaObserver = new HexaObserver();
    Observer octalObserver = new OctalObserver();
    
    subject.attach(binaryObserver);
    subject.attach(hexaObserver);
    subject.attach(octalObserver);
    
    subject.setState(10);
    subject.notifyAllObservers();
    
    subject.setState(20);
    subject.notifyAllObservers();
  }
}