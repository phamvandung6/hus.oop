package hus.oop.lab7._1_7;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooowwwww");
    }

}
