package hus.oop.lab9.singleton_pattern.bai_1;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // Will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}