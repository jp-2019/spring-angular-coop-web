import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class MyCircle extends Circle implements IShape {

    public void draw() {

        setCenterX(400.0f);
       setCenterY(135.0f);
        setRadius(100.0f);

//        System.out.println("draw circle");


    }

}
