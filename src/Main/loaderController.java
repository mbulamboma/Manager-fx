/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Framework.Roots;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle; 
import javafx.animation.PauseTransition; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author mbula
 */
public class loaderController implements Initializable {
    @FXML AnchorPane loaderPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(10));
        pauseTransition.setOnFinished(ev -> {
            callTemplate();
        });
        pauseTransition.play();
    }    
    private void callTemplate(){
        try { 
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource(Roots.TEMPLATE));

                Scene scene = new Scene(root); 
                stage.setTitle("Accueil-SchoolFx");
                stage.initStyle(StageStyle.DECORATED); 
                stage.getIcons().add(new Image(getClass().getResourceAsStream("/Icones/Sx100.png")));
                stage.setResizable(false); 
                stage.setScene(scene);  
                stage.show();
                loaderPane.getScene().getWindow().hide();
            } catch (IOException ex) {
                System.out.println("call template error");
            }
    }
}
