import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyCircle extends Circle implements Shape {

    public void draw() {

        setCenterX(400.0f);
       setCenterY(135.0f);
        setRadius(100.0f);



//        System.out.println("draw circle");


    }

}
