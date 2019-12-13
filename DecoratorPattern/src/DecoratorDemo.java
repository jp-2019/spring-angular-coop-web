import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DecoratorDemo extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Shape redCircle = new RedShapeDecorator(new MyCircle());
        redCircle.draw();
//        Shape rect = new RedShapeDecorator(new Rectangle());
//        rect.draw();

        // set title for the stage
//        stage.setTitle("fine little circle");

        stage.setTitle("Nice little Shapes");
        // create a circle
//        Circle circle = new Circle(150.0f, 150.0f, 80.f);



//        // create a Group
        MyCircle circle = new MyCircle();

        circle.draw();

        MyRectangle rectangle = new MyRectangle();
        rectangle.draw();

        Group root = new Group((Circle) redCircle, rectangle);
        //Creating a scene object
        Scene scene = new Scene(root, 600, 300, Color.BLANCHEDALMOND);
        //Setting title to the Stage
//        Stage stage = new Stage();



        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}