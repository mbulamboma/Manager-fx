/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject; 
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author mbula
 */
public class classes extends RecursiveTreeObject<classes>{
    private StringProperty num;
    private StringProperty Classe;
    private StringProperty Moyenne;
    private StringProperty premier;
    private StringProperty Success;
    public classes(String num, String Classes, String Moyenne, String premier, String Success){
        this.num = new SimpleStringProperty(num);
        this.Classe = new SimpleStringProperty(Classes);
        this.Moyenne = new SimpleStringProperty(Moyenne);
        this.premier = new SimpleStringProperty(premier);
        this.Success = new SimpleStringProperty(Success);
    }

    public StringProperty getNum() {
        return num;
    }

    public void setNum(StringProperty num) {
        this.num = num;
    }

    public StringProperty getClasse() {
        return Classe;
    }

    public void setClasse(StringProperty Classe) {
        this.Classe = Classe;
    }

    public StringProperty getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(StringProperty Moyenne) {
        this.Moyenne = Moyenne;
    }

    public StringProperty getPremier() {
        return premier;
    }

    public void setPremier(StringProperty premier) {
        this.premier = premier;
    }

    public StringProperty getSuccess() {
        return Success;
    }

    public void setSuccess(StringProperty Success) {
        this.Success = Success;
    }
    
}
