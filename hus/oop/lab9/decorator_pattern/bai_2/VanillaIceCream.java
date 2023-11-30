package hus.oop.lab9.decorator_pattern.bai_2;

// Concrete classes implementing the IceCream interface
public class VanillaIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Vanilla Ice Cream";
    }
}