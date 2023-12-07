package hus.oop.lab10.factory_method_pattern.bai_3;

public class FruitFactory {
    Fruit provideFruit(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            case "orange":
                return new Orange();
        }
        throw new RuntimeException("No matching object could be created");
    }
}
