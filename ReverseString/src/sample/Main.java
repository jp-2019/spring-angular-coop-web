package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Reverse String");

//        StringBuilder sb = new StringBuilder();
//
//        for(int i = textField.length() - 1; i >= 0; i--)
//        {
//            sb.append(str.charAt(i));
//        }

        String str = "This text";
        TextField textField = new TextField("Name");
        String reverse = new StringBuffer(str).reverse().toString();
        Label label= new Label();
        Button button = new Button("Submit");
        button.setOnAction(e ->
                {

                    System.out.print(reverse);
//                    label.setText( textField.getText());
                }
        );
                VBox vBox  = new VBox();
        vBox.getChildren().addAll( textField, button, label);
        Scene scene = new Scene(vBox,  400, 300);


        Stage stage = new Stage();
        stage.setScene(scene);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);


    }
}
