package hus.oop.lab10.factory_method_pattern.bai_2;

// Step 1: Tạo interface Product để định nghĩa phương thức commonOperation()
interface Product {
    void commonOperation();
}

// Step 2: Tạo các lớp cụ thể thực hiện interface Product
class ConcreteProductA implements Product {
    @Override
    public void commonOperation() {
        System.out.println("Concrete Product A common operation");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void commonOperation() {
        System.out.println("Concrete Product B common operation");
    }
}

// Step 3: Tạo abstract class Creator để khai báo phương thức factoryMethod()
abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        // Gọi factory method để tạo đối tượng Product
        Product product = factoryMethod();
        product.commonOperation();
    }
}

// Step 4: Tạo các lớp cụ thể thực hiện abstract class Creator
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

