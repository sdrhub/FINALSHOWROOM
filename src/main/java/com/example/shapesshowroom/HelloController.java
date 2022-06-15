package com.example.shapesshowroom;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML
    public ChoiceBox<String> choisebox1;
    @FXML
    private Button button1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
    }

    public void loadData() {
        list.removeAll(list);
        String a = "Arc";
        String b = "Cubic Curve";
        String c = "Cylinder";
        String d = "Ellipse";
        String e = "Line";
        String f = "Path";
        String g = "Polygon";
        String h = "Rectangle";
        list.addAll(a, b, c, d, e, f, g, h);
        choisebox1.getItems().addAll(list);
    }


    public void switchtoscene2(ActionEvent event) throws IOException {
        String choice = choisebox1.getValue();
        if (choice == null) {
            System.out.println("y"); //elegxos gia personal use
        } else if (choice.equals("Arc")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Arc.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");
        } else if (choice.equals("Cubic Curve")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Curve.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");
        } else if (choice.equals("Cylinder")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cylinder.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");
        } else if (choice.equals("Ellipse")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Arc.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");
        } else if (choice.equals("Line")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Line.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");   //elexgos gia personal use
        } else if (choice.equals("Path")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Line.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");   //elexgos gia personal use
        } else if (choice.equals("Polygon")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Polygon.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");   //elexgos gia personal use
        } else if (choice.equals("Rectangle")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rectangle.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            System.out.println("x");   //elexgos gia personal use
        }
    }
}