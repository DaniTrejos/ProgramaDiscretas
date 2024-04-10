package org.example.interfazdiscretas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/*
Atores:
    Daniela arboleda
    Eyner Andres Diaz
*/
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label respuestaText;

    @FXML
    private Label CPrimos;

    @FXML
    private TextField numA;

    @FXML
    private TextField numB;

    @FXML
    private Label result2;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        int a=Integer.parseInt(numA.getText());
        int b=Integer.parseInt(numB.getText());
        if(a<b){
            int i=a;
            a=b;
            b=i;
        }
        int mcd=HelloApplication.MCD(a,b);
        respuestaText.setText("El MCD de los números es: " + mcd);
        if(mcd==1){
            CPrimos.setText( a + " y " + b + " son coprimos ");
        }
        else{
            CPrimos.setText( a + " y " + b + " NO son coprimos ");
        }

        int mcd2=HelloApplication.MCD(a/mcd,b/mcd);

        result2.setText("MCD de la division es: "+ mcd2);


    }


}