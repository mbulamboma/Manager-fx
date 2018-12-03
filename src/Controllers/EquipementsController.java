/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mbula
 */
public class EquipementsController implements Initializable {
    @FXML
    private AnchorPane erreur_msg;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    void close_msg(ActionEvent event) {
        erreur_msg.setVisible(false);
    } 
    @FXML 
    void show_error(ActionEvent event){
        erreur_msg.setVisible(true);
    }
    
}
