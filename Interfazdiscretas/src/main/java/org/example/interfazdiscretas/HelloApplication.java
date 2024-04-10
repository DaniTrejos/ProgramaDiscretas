package org.example.interfazdiscretas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/*
Atores:
    Daniela arboleda
    Eyner Andres Diaz
*/
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 450);
        stage.setTitle("Calculadora MCD");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static int MCD(int numA,int numB){
        int residuo=numA % numB;
        if (residuo==0){
            if(numB<0){
                return numB*-1;
            }
            else{
                return numB;
            }
        }
        else{
            return MCD(numB,residuo);
        }

    }


}