public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape) {

        setCenterX(400.0f);
        setCenterY(135.0f);
        setRadius(100.0f);

        System.out.println("The border is red");
    }
}
