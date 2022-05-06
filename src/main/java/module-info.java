module com.example.shapesshowroom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapesshowroom to javafx.fxml;
    exports com.example.shapesshowroom;
}