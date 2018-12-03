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
public class ActivitiesController implements Initializable {
    
    @FXML
    private AnchorPane form_new_parti;
    @FXML
    private AnchorPane listparts;
    @FXML
    private AnchorPane form_new_anim;
    @FXML
    private AnchorPane listanim;
    @FXML
    private AnchorPane form_new_act;
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
    void close_new_participant(ActionEvent event) {
        this.form_new_parti.setVisible(false);
    }
    @FXML
    void see_new_part_form(ActionEvent event) {
        this.form_new_parti.setVisible(true);
    }
    @FXML
    void close_list_part(ActionEvent event) {
        this.listparts.setVisible(false);
        this.form_new_parti.setVisible(false);
    }
    @FXML
    void see_parts_list(ActionEvent event) {
        this.listparts.setVisible(true);
    }
    
    @FXML
    void close_new_anim_form(ActionEvent event) {
        this.form_new_anim.setVisible(false);
    }
    @FXML
    void see_new_anim_form(ActionEvent event) {
        this.form_new_anim.setVisible(true);
    }
    @FXML
    void close_list_anim(ActionEvent event) {
        this.listanim.setVisible(false);
        this.form_new_anim.setVisible(false);
    }
    @FXML
    void see_list_anim(ActionEvent event) {
        this.listanim.setVisible(true);
    }
    @FXML
    void close_form_new_act(ActionEvent event) {
        this.form_new_act.setVisible(false);
    }
    @FXML
    void see_form_new_act(ActionEvent event) {
        this.form_new_act.setVisible(true);
    }
}
