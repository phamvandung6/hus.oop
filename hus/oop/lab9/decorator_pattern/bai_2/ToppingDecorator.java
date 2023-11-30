package hus.oop.lab9.decorator_pattern.bai_2;

// ToppingDecorator abstract class implementing the IceCream interface
public abstract class ToppingDecorator implements IceCream {

    public abstract String getDescription();

    public abstract String addTopping();
}
