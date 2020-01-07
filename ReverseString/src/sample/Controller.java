package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {

    public class ReverseString extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Reverse String");

            TextField textField = new TextField();

            VBox vbox = new VBox(textField);

            Button button = new Button("Submit");

            Scene scene = new Scene(vbox,  200, 100);
            primaryStage.setScene(scene);
            primaryStage.show();





        }

    }
}

