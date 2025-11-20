package com.example.renovacionlicencias;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("¡Mi primera app JavaFX 2025!");

        Label titulo = new Label("Ceropapel Desktop - JavaFX");
        titulo.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField campo = new TextField();
        campo.setPromptText("Escribe algo aquí...");

        Button boton = new Button("¡Haz clic!");
        boton.setStyle("-fx-background-color: #0066cc; -fx-text-fill: white; -fx-font-size: 16px;");
        boton.setOnAction(e -> {
            String texto = campo.getText();
            titulo.setText(texto.isEmpty() ? "¡Hola desde México!" : "¡Hola " + texto + "!");
        });

        VBox root = new VBox(20, titulo, campo, boton);
        root.setPadding(new Insets(40));
        root.setStyle("-fx-background-color: #f0f0f0; -fx-alignment: center;");

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}