package hus.oop.lab10.abstract_factory_pattern.bai_2;

public class FactoryProducer{
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
