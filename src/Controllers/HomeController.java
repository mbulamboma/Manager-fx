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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;   
import javafx.scene.Node;
import javafx.scene.chart.AreaChart; 
import javafx.scene.chart.XYChart;
import Framework.classes;   
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView; 
import javafx.scene.layout.AnchorPane;  

/**
 * FXML Controller class
 *
 * @author mbula
 */

public class HomeController implements Initializable {
    
    @FXML
    private AnchorPane HomeContent;
    
    @FXML
    private AreaChart<?, ?> mychart;
    
    @FXML
    private AreaChart<?, ?> classeschart;
   
    @FXML
    private TableView<classes> listClasses;
    
    @FXML
    private TableColumn <classes,String> Classesnum;  
    
    @FXML
    private TableColumn<classes,String> ClasseRate;
        

    @FXML
    private ChoiceBox<String> dataType;

    @FXML
    private ChoiceBox<String> niveaux;

    @FXML
    private ChoiceBox<String> years;

    @FXML
    private ChoiceBox<String> periode;



    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
          XYChart.Series formateurs = new XYChart.Series(); 
          formateurs.getData().add(new XYChart.Data("jan", 50));
          formateurs.getData().add(new XYChart.Data("fev", 78));
          formateurs.getData().add(new XYChart.Data("mars", 64));
          formateurs.getData().add(new XYChart.Data("avril", 55));
          formateurs.getData().add(new XYChart.Data("mai", 68));
          formateurs.getData().add(new XYChart.Data("juin", 47));
          formateurs.getData().add(new XYChart.Data("juillet", 89));
          formateurs.getData().add(new XYChart.Data("août", 54));
          formateurs.getData().add(new XYChart.Data("sept", 94));
          formateurs.getData().add(new XYChart.Data("oct", 78));
          formateurs.setName("Nombres des Benéficiaires");
          
          XYChart.Series employes = new XYChart.Series(); 
          employes.getData().add(new XYChart.Data("jan", 10));
          employes.getData().add(new XYChart.Data("fev", 15));
          employes.getData().add(new XYChart.Data("mars", 18));
          employes.getData().add(new XYChart.Data("avril", 20));
          employes.getData().add(new XYChart.Data("mai", 22));
          employes.getData().add(new XYChart.Data("juin", 27));
          employes.getData().add(new XYChart.Data("juillet", 18));
          employes.getData().add(new XYChart.Data("août", 12));
          employes.getData().add(new XYChart.Data("sept", 11));
          employes.getData().add(new XYChart.Data("oct", 9));
          employes.setName("Nombre de formations");
          
          XYChart.Series salaire = new XYChart.Series(); 
          salaire.getData().add(new XYChart.Data("jan", 99));
          salaire.getData().add(new XYChart.Data("fev", 95));
          salaire.getData().add(new XYChart.Data("mars", 85));
          salaire.getData().add(new XYChart.Data("avril", 89));
          salaire.getData().add(new XYChart.Data("mai", 96));
          salaire.getData().add(new XYChart.Data("juin", 75));
          salaire.getData().add(new XYChart.Data("juillet", 79));
          salaire.getData().add(new XYChart.Data("août", 80));
          salaire.getData().add(new XYChart.Data("sept", 85));
          salaire.getData().add(new XYChart.Data("oct", 87));
          salaire.setName("Nombre de sensibilisations");
          mychart.getData().addAll(formateurs,employes, salaire); 
          
          XYChart.Series success = new XYChart.Series(); 
          success.getData().add(new XYChart.Data("1 A", 50));
          success.getData().add(new XYChart.Data("1 B", 78));
          success.getData().add(new XYChart.Data("1 C", 64));
          success.getData().add(new XYChart.Data("1 D", 55));
          success.getData().add(new XYChart.Data("1 E", 68));
          success.getData().add(new XYChart.Data("1 F", 47));
          success.getData().add(new XYChart.Data("1 G", 89));
          success.getData().add(new XYChart.Data("1 H", 54));
          success.getData().add(new XYChart.Data("2 A", 94));
          success.getData().add(new XYChart.Data("2 B", 78));
          success.getData().add(new XYChart.Data("2 C", 94));
          success.getData().add(new XYChart.Data("2 D", 77));
          success.getData().add(new XYChart.Data("3 A", 86));
          success.getData().add(new XYChart.Data("3 B", 78));
          success.getData().add(new XYChart.Data("3 c", 57));
          success.getData().add(new XYChart.Data("3 Peda", 54));
          success.getData().add(new XYChart.Data("3 Com", 78));
          success.getData().add(new XYChart.Data("4 A", 84));
          success.getData().add(new XYChart.Data("4 B", 41));
          success.getData().add(new XYChart.Data("4 C", 85));
          success.getData().add(new XYChart.Data("4 Peda", 42));
          success.getData().add(new XYChart.Data("4 com", 78));
          success.getData().add(new XYChart.Data("5 Math", 45));
          success.getData().add(new XYChart.Data("5 Bio", 67));
          success.getData().add(new XYChart.Data("5 Peda", 54));
          success.getData().add(new XYChart.Data("5 Com", 78));
          success.getData().add(new XYChart.Data("6 Math", 54));
          success.getData().add(new XYChart.Data("6 Bio", 64));
          success.getData().add(new XYChart.Data("6 Peda", 89));
          success.getData().add(new XYChart.Data("6 Com", 32));
          success.setName("Taux de Réussite");
          
          
          classeschart.getData().addAll(success); 
          
          
          final ObservableList levels = FXCollections.observableArrayList("Secondaire", "Scientifiques", "Pedagogies", "Commerciales");
          niveaux.setItems(levels);
          niveaux.setValue((String)levels.get(0));
          final ObservableList periods = FXCollections.observableArrayList("1 ere Periode", "2 eme Periode", "Examen 1 er Semestre", "3 eme Periode", "4 eme Periode", "Examen 2 eme Semestre", "Total");
          periode.setItems(periods);
          periode.setValue((String) periods.get(0));
          final ObservableList Ayears = FXCollections.observableArrayList("2015", "2016", "2017", "2018", "2019", "2020");
          this.years.setItems(Ayears);
          this.years.setValue((String)Ayears.get(0));
          
          final ObservableList dataTypes = FXCollections.observableArrayList("Resultats General", "Resultat en Math", "Resultat en Francais", "Resultat en Anglais", "Resultat en Physique", "Nombre des Conduites");
          dataType.setItems(dataTypes);
          dataType.setValue((String) dataTypes.get(0));
          
          
    } 
    
    @FXML
    private void goto_students(ActionEvent event)throws IOException{
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
        HomeContent.getChildren().clear();
        HomeContent.getChildren().add((Node) Page);
    }
}
