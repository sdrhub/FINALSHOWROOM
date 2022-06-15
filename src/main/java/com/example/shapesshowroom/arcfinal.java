package com.example.shapesshowroom;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

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

    public void startLine(Stage primaryStage , double Startx, double Endx){
        primaryStage.setTitle("Line");
        Group group = new Group();
        Line line = new Line();
        line.setStartX(Startx);
        line.setStartY(0.0f);
        line.setEndX(Endx);
        line.setEndY(100.0f);
        group.getChildren().addAll(line);
        Scene scene = new Scene (group, 200, 300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startCurve(Stage primaryStage, double Startxc,double Startyc,double Endxc, double Endyc){
        primaryStage.setTitle("Curve");
        Group group = new Group();
        CubicCurve cubic = new CubicCurve();
        cubic.setStartX(Startxc);
        cubic.setStartY(Startyc);
        cubic.setControlX1(25.0f);
        cubic.setControlY1(0.0f);
        cubic.setControlX2(75.0f);
        cubic.setControlY2(100.0f);
        cubic.setEndX(Endxc);
        cubic.setEndY(Endyc);
        group.getChildren().addAll(cubic);
        Scene scene = new Scene (group, 200, 300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void startCylinder(Stage primaryStage, double height,double radius) {
        primaryStage.setTitle("Cylinder");
        Group group = new Group();
        Cylinder newcyn = new Cylinder();
        newcyn.setRadius(radius);
        newcyn.setHeight(height);
        newcyn.setTranslateX(200);
        newcyn.setTranslateY(150);

        PerspectiveCamera newcamera = new PerspectiveCamera();
        newcamera.setTranslateX(-50);
        newcamera.setTranslateY(10);
        newcamera.setTranslateZ(0);
        group.getChildren().addAll(newcyn);
        Scene scene = new Scene (group, 200, 300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startRectangle(Stage primaryStage, double height, double width){
        primaryStage.setTitle("Rectangle");
        Group group = new Group();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        rectangle.setX(50);
        rectangle.setY(50);
        group.getChildren().addAll(rectangle);
        Scene scene = new Scene (group, 200, 300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public static void HelloApplication(String[]args){
        launch(args);
}
}
