package com.example.shapesshowroom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController2 {
    @FXML
    private TextField centerx, centery, radiusx, radiusy, stx, ex, startxC, startyC, endxC, endyC, height, radius,widthR,heightR;
    @FXML
    private Button button2;

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void next(ActionEvent event) throws IOException {
        String centx = centerx.getText();
        double cetx = Double.parseDouble(centx);
        String centy = centery.getText();
        double cety = Double.parseDouble(centy);
        String radx = radiusx.getText();
        double radex = Double.parseDouble(radx);
        String rady = radiusy.getText();
        double radey = Double.parseDouble(rady);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.start(primaryStage, cetx, cety, radex, radey);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void nextLine(ActionEvent event) throws IOException {
        String startx = stx.getText();
        String endx = ex.getText();
        double Startx = Double.parseDouble(startx);
        double Endx = Double.parseDouble(endx);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.startLine(primaryStage, Startx, Endx);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void nextCurve(ActionEvent event) throws IOException {
        String startxc = startxC.getText();
        String startyc = startyC.getText();
        String endxc = endxC.getText();
        String endyc = endyC.getText();
        double Startxc = Double.parseDouble(startxc);
        double Startyc = Double.parseDouble(startyc);
        double Endxc = Double.parseDouble(endxc);
        double Endyc = Double.parseDouble(endyc);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.startCurve(primaryStage, Startxc, Startyc, Endxc, Endyc);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void nextCylinder(ActionEvent event) throws IOException {
        String Height = height.getText();
        String Radius = radius.getText();
        double height = Double.parseDouble(Height);
        double radius = Double.parseDouble(Radius);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.startCylinder(primaryStage, height, radius);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void nextRectangle(ActionEvent event) throws IOException {
        String Height = heightR.getText();
        String Width = widthR.getText();
        double height = Double.parseDouble(Height);
        double width = Double.parseDouble(Width);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.startRectangle(primaryStage, height, width);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
