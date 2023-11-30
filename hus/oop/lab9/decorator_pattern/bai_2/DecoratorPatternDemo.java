package hus.oop.lab9.decorator_pattern.bai_2;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Tạo một loại kem cơ bản
        IceCream basicIceCream = new ChocolateIceCream();

        // Thêm topping mật ong vào kem cơ bản
        IceCream honeyIceCream = new HoneyToppingDecorator(basicIceCream);

        // Thêm topping hạt điều vào kem với topping mật ong
        IceCream honeyNutIceCream = new NutToppingDecorator(honeyIceCream);

        // Hiển thị mô tả của kem sau khi đã thêm các topping
        System.out.println("Description: " + honeyNutIceCream.getDescription());
    }
}
