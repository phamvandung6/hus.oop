package hus.oop.lab10.abstract_factory_pattern.bai_2;

public class Client {
    // giao diện shape

    public static void main(String[] args) {
        // lấy ra shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        // lấy ra đối tượng shape rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        // gọi phương thức draw của đối tượng shape1
        shape1.draw();
        // lấy ra đối tượng shape square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        // gọi phương thức draw của đối tượng shape2
        shape2.draw();
        // lấy ra một shape fatory khác nhưng lần này khởi tạo rouded = true
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        // tạo đối tươngj shape rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        // test phương thức
        shape3.draw();
        // tạo đối tượng shape square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        // test phương thức
        shape4.draw();
    }
    // kết quả khi chạy:
    /*
     * Draw Rectangle
     * Draw Square
     * Draw RoundedRectangle
     * Draw RoundedSquare
     */
}
