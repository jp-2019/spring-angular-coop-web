class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rect;

    ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rect = new Rectangle();
}

void drawCircle() {
        circle.draw();
}

void drawRect() {
        rect.draw();
}

void drawSquare() {
        square.draw();
}

}
