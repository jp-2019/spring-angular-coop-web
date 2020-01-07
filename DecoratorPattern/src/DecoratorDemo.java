import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DecoratorDemo extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


//        Shape rect = new RedShapeDecorator(new Rectangle());
//        rect.draw();

        // set title for the stage
//        stage.setTitle("fine little circle");

        stage.setTitle("Nice little Shapes");
        // create a circle
//        Circle circle = new Circle(150.0f, 150.0f, 80.f);



        RedIShapeDecorator redCircle = new RedIShapeDecorator(new MyCircle());
        redCircle.draw();

        MyRectangle rectangle = new MyRectangle();
        rectangle.draw();

        Group root = new Group(redCircle, rectangle);
        //Creating a scene object
        Scene scene = new Scene(root, 600, 300, Color.BLANCHEDALMOND);


        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}