package hus.oop.lab9.decorator_pattern.bai_2;

class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "Adding honey topping";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Honey";
    }
}
