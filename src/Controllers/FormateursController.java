/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mbula
 */
public class FormateursController implements Initializable {
    @FXML
    private AnchorPane forma_modal;
    @FXML
    private AnchorPane forma_see;
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
    private void close_see(ActionEvent event){
        forma_see.setVisible(false);
    }
    @FXML 
    private void see_forma(ActionEvent event){
        forma_see.setVisible(true);
    }
    @FXML
    private void add_formateur(ActionEvent event){
        forma_modal.setVisible(true);
    }
    @FXML
    private void close_fomateur(ActionEvent event){
        forma_modal.setVisible(false);
    }
}
