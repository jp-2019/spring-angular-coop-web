import javafx.scene.shape.Circle;

public class ShapeDecorator extends Circle implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();

    }
}
