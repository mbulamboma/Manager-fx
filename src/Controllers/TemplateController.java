/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Framework.Roots;  
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane; 

/**
 * FXML Controller class
 *
 * @author mbula
 */
public class TemplateController implements Initializable { 
    
    @FXML private AnchorPane Content;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.ajax(FXMLLoader.load(getClass().getResource(Roots.Home)));
        } catch (IOException ex) {
            Logger.getLogger(TemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void goto_home() throws IOException{ 
        this.ajax(FXMLLoader.load(getClass().getResource(Roots.Home)));
    }    
    @FXML
    private void goto_formateurs(ActionEvent event)throws IOException{
        this.ajax(FXMLLoader.load(getClass().getResource(Roots.FORMATEURS)));
    }
    @FXML
    private void goto_equip(ActionEvent event)throws IOException{
        this.ajax(FXMLLoader.load(getClass().getResource(Roots.EQUIPEMENT)));
    }    
    @FXML
    private void goto_act(ActionEvent event)throws IOException{
        this.ajax(FXMLLoader.load(getClass().getResource(Roots.ACTIVITIES)));
    }
 
    private void ajax(Node Page){
        Content.getChildren().clear();
        Content.getChildren().add((Node) Page);
    }
}
