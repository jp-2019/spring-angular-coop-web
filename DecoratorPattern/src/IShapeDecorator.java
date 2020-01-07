import javafx.scene.shape.Circle;

public class IShapeDecorator extends Circle implements IShape {

    protected IShape decoratedIShape;

    public IShapeDecorator(IShape decoratedIShape) {
        this.decoratedIShape = decoratedIShape;
    }

    public void draw(){

        setCenterX(400.0f);
        setCenterY(135.0f);
        setRadius(100.0f);

        decoratedIShape.draw();

    }
}
