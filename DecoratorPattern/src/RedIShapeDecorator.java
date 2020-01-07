public class RedIShapeDecorator extends IShapeDecorator {
    public RedIShapeDecorator(IShape decoratedIShape) {
        super(decoratedIShape);
    }

    public void draw() {
        super.draw();
        setRedBorder(decoratedIShape);
    }

    private void setRedBorder(IShape shape) {


        System.out.println("The border is red");
    }
}
