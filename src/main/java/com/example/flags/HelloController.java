package com.example.flags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    Pane Top, middle, Bottom;

    @FXML
    Label label;

    @FXML
    public void Austria() {
        Top.setStyle("-fx-background-color: red");
        middle.setStyle("-fx-background-color: white");
        Bottom.setStyle("-fx-background-color: red");
        label.setText("Austria");


    }
    @FXML
    public void lesothoButton() {
        Top.setStyle("-fx-background-color: blue");
        middle.setStyle("-fx-background-color: white");
        Bottom.setStyle("-fx-background-color: green");
        label.setText("Lesotho");

    }
    @FXML
    public void Bulgaria(){
        Top.setStyle("-fx-background-color: white");
        middle.setStyle("-fx-background-color: green");
        Bottom.setStyle("-fx-background-color: red");
        label.setText("Bulgaria");

    }
    @FXML
    public void Estonia(){
        Top.setStyle("-fx-background-color: #0072CE");
        middle.setStyle("-fx-background-color: Black");
        Bottom.setStyle("-fx-background-color: white");
        label.setText("Estonia");

    }
    public void Hungary(){
        Top.setStyle("-fx-background-color: red");
        middle.setStyle("-fx-background-color: white");
        Bottom.setStyle("-fx-background-color: green");
        label.setText("Hungary");
    }



    @FXML
    public void reset(ActionEvent ac) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader. load());
        Stage stage = (Stage) ((Node) ac.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}