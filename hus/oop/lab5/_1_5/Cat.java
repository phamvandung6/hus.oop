package hus.oop.lab5._1_5;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow Meow");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }

}
