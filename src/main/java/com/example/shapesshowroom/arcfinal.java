package com.example.shapesshowroom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

import java.io.IOException;

public class arcfinal extends HelloApplication {
    public void start(Stage primaryStage,double cetx,double cety,double radex,double radey) throws IOException{
        primaryStage.setTitle("Arc");
        Group group = new Group();
        Arc arc = new Arc();
        arc.setCenterX(cetx);
        arc.setCenterY(cety);
        arc.setRadiusX(radex);
        arc.setRadiusY(radey);
        arc.setStartAngle(45.0f);
        arc.setLength(270.0f);
        arc.setType(ArcType.ROUND);
        arc.setOpacity(1.0);
        arc.setFill(Color.BLACK);

        group.getChildren().addAll(arc);
        Scene scene = new Scene (group, 200, 300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
public static void HelloApplication(String[]args){
        launch(args);
}
}
