package hus.oop.lab9.decorator_pattern.bai_1;

public class RedShapeDecorator extends ShapeDecorator {
    protected Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Setting red border");
    }
}
