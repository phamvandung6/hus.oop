package hus.oop.lab9.decorator_pattern.bai_1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Tạo một đối tượng Circle
        Shape circle = new Circle();

        // Tạo một đối tượng RedShapeDecorator để bọc đối tượng Circle
        Shape redCircle = new RedShapeDecorator(new Circle());

        // Tạo một đối tượng RedShapeDecorator để bọc đối tượng Rectangle
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        // Gọi phương thức draw() của các đối tượng để vẽ
        System.out.println("Drawing simple circle:");
        circle.draw();

        System.out.println("\nDrawing red circle:");
        redCircle.draw();

        System.out.println("\nDrawing red rectangle:");
        redRectangle.draw();
    }
}

