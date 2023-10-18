package hus.oop.lab5._1_5;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal [" + super.toString() + "]";
    }
}
