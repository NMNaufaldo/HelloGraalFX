package org.example;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label label = new Label("Hello World");
        JFXButton button = new JFXButton("Click Me");
        button.setStyle("-jfx-button-type: RAISED; -fx-background-color: blue; -fx-text-fill: white;");
        button.setOnAction(event -> label.setText("Hello JavaFX"));
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 600.0, 600.0);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
