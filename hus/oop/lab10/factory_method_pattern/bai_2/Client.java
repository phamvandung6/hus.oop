package hus.oop.lab10.factory_method_pattern.bai_2;

// Step 5: Sử dụng Factory Method Pattern
public class Client {
    public static void main(String[] args) {
        // Tạo đối tượng Creator
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        // Gọi phương thức someOperation() để tạo và sử dụng đối tượng Product
        creatorA.someOperation();
        creatorB.someOperation();

        /*
         * output:
         * Concrete Product A common operation
         * Concrete Product B common operation
         */
    }
}