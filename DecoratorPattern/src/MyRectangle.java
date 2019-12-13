import javafx.scene.shape.Rectangle;



public class MyRectangle extends Rectangle implements Shape{

    public void draw() {

        setX(50);
        setY(50);
        setWidth(200);
        setHeight(100);
        setArcWidth(20);
        setArcHeight(20);


//        System.out.println("draw rectangle");
    }
}
