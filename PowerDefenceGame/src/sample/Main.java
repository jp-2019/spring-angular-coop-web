package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;


import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import sample.amory.ARFifteen;
import sample.amory.Armory;
import sample.amory.MSixteen;

public class Main extends Application {

    private static final String crowURL = "sample/resources/crow.png";
    private static final String orkURL= "sample/resources/ork.png";
    private static final String sauronURL = "sample/resources/sauron.png";

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Tower Defence Game");

        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: green;");
        // pane.setBackground(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY));


        TDButton btnNineMills = new TDButton("btnNineMills", 0, 0, new MSixteen());
        TDButton btnARFifteen = new TDButton("btnARFifteen", 100, 0, new ARFifteen());
        TDButton btnMSixteen = new TDButton("btnMSixteen", 200, 0, new MSixteen());


//        Button c = new Button();
//        btnNineMills.setText("NineMills");
//        btnNineMills.setLayoutX(0);
//        btnNineMills.setLayoutY(0);
//
//
//        Button btnMSixteen = new Button();
//        btnMSixteen.setText("MSixteen");
//        btnMSixteen.setLayoutX(100);
//        btnMSixteen.setLayoutY(0);



//        Button btnARFifteen = new Button();
//        btnARFifteen.setText("ARFifteen");
//        btnARFifteen.setLayoutX(200);
//        btnARFifteen.setLayoutY(0);



//        Circle ball = new Circle(10, Color.NAVY);


        Image crow = new Image(crowURL);

        Image ork = new Image(orkURL);
        Image sauron = new Image(sauronURL);

        Circle circleCrow = new Circle(20);
        circleCrow.setTranslateX(50);
        circleCrow.setTranslateY(25);
        circleCrow.setCenterX(10);
        circleCrow.setCenterY(50);
        // circleCrow.setFill(new ImagePattern(crow));
        circleCrow.setFill(new ImagePattern(crow, -0.1, 0.1, 1, 1, true));
        circleCrow.relocate(5,50);

        Circle circleOrk = new Circle(50);
        circleOrk.setTranslateX(80);
        circleOrk.setTranslateY(120);
        circleOrk.setCenterX(50);
        circleOrk.setCenterY(50);
        circleOrk.setFill(new ImagePattern(ork));
        //circleOrk.setFill(new ImagePattern(ork, 0.2, 0.2, 1, 1, true));

        Circle circleSauron = new Circle(50);
        circleSauron.setTranslateX(20);
        circleSauron.setTranslateY(200);
        circleSauron.setCenterX(50);
        circleSauron.setCenterY(50);
        circleSauron.setFill(new ImagePattern(sauron));
        //circleSauron.setFill(new ImagePattern(sauron, 0.2, 0.2, 1, 1, true));

        pane.getChildren().addAll(btnARFifteen, btnMSixteen ,btnNineMills, circleCrow );

        btnARFifteen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ArmoryFactory af = new ArmoryFactory();
                Armory ar = af.getArmory("ARFifteen");
                ar.shoot();

                if(ar.getRounds()==0){
                    pane.getChildren().remove(circleCrow);
                    btnARFifteen.setDisable(true);
                    System.out.println("Out of rounds!");
                }
            }
        });

        btnMSixteen.setOnAction(actionEvent -> {
            ArmoryFactory af = new ArmoryFactory();
            Armory ar = af.getArmory("MSixteen");
            ar.shoot();

            if(ar.getRounds()==0){
                pane.getChildren().remove(circleCrow);
                btnMSixteen.setDisable(true);
                System.out.println("Out of rounds!");
            }
        });

        btnNineMills.setOnAction(actionEvent -> {
            ArmoryFactory af = new ArmoryFactory();
            Armory ar = af.getArmory("nineMills");
            ar.shoot();

            if(ar.getRounds()==0){
                pane.getChildren().remove(circleCrow);
                btnNineMills.setDisable(true);
                System.out.println("Out of rounds!");
            }
        });

        //   HBox hBox = new HBox(comboBox);
        Scene scene = new Scene(pane, 400, 400, Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();

        Bounds bounds = pane.getBoundsInLocal();
        Timeline timeline = new Timeline(200, new KeyFrame(Duration.seconds(3),
                new KeyValue(circleCrow.layoutXProperty(), bounds.getMaxX()-circleCrow.getRadius())));
        timeline.setCycleCount(5);
        timeline.play();



    }


    public static void main(String[] args) {
        launch(args);
    }
}