package hus.oop.lab10.factory_method_pattern.bai_3;

public class Client {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        // Create Apple object using factory and call produceJuice method
        Fruit fruit = factory.provideFruit("apple");
        fruit.produceJuice();
        // Create Orange object using factory and call produceJuice method
        fruit = factory.provideFruit("orange");
        fruit.produceJuice();
        // Create Banana object using factory and call produceJuice method
        fruit = factory.provideFruit("banana");
        fruit.produceJuice();

        // output:
        /*
         * Apple produceJoice
         * Orange produceJoice
         * Banana produceJoice
         * 
         */
    }
}
