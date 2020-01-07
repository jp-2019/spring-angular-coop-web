package com.company;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.beans.EventHandler;



public class Main extends Application

    {

        @Override
        public void start(Stage primaryStage) throws Exception{

            TextField textFieldOne = new TextField();
            TextField textFieldTwo = new TextField();
            Button button = new Button("Submit");

            TabPane tabPane = new TabPane();

            Tab tab1 = new Tab("Tab 1", new Label("Show Tab 1"));
            Tab tab2 = new Tab("Tab 2"  , new Label("Show Tab 2"));
            Tab tab3 = new Tab("Tab 3" , new Label("Show Tab 3"));

            tabPane.getTabs().add(tab1);
            tabPane.getTabs().add(tab2);
            tabPane.getTabs().add(tab3);

            HBox hbox = new HBox(textFieldOne, textFieldTwo, button, tabPane);
            hbox.setSpacing(10);
            hbox.setAlignment(Pos.BASELINE_CENTER);

            button.setOnAction(new EventHandler() {

                public void handle(Event event) {
                    A a=new A(textFieldOne.getText());
                    Thread thread_object=new Thread(a);
                    thread_object.start();
                }


            });

            Scene scene = new Scene(hbox, 600, 300);
            primaryStage.setTitle("Multithreading");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        class A implements Runnable
        {
            String to_print;
            A(String to_print){
                this.to_print=to_print;
            }
            public void run(){
                StringBuilder input = new StringBuilder();

                // append a string into StringBuilder input1
                input.append(this.to_print);

                // reverse StringBuilder input1
                input = input.reverse();
                System.out.println(input);
            }

        }


        public static void main(String[] args) {
            launch(args);
        }
    }