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
    private TextField centerx,centery,radiusx,radiusy;
    @FXML
    private Button button2;

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void next(ActionEvent event) throws IOException {
        String centx= centerx.getText();
        double cetx=Double.parseDouble(centx);
        String centy= centery.getText();
        double cety=Double.parseDouble(centy);
        String radx= radiusx.getText();
        double radex=Double.parseDouble(radx);
        String rady= radiusy.getText();
        double radey=Double.parseDouble(rady);



        FXMLLoader loader = new FXMLLoader(getClass().getResource("arcfinal.fxml"));
        root = loader.load();
        arcfinal arcfinal = loader.getController();
        Stage primaryStage = new Stage();
        arcfinal.start(primaryStage, cetx,cety,radex,radey);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}
