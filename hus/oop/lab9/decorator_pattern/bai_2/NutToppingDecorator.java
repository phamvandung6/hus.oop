package hus.oop.lab9.decorator_pattern.bai_2;


class NutToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "Adding nut topping";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Nut";
    }
}