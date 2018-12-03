/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
  
import Database.loader;
import java.sql.*;      

/**
 *
 * @author mbula
 */
public class DBase { 
    /**
     * Connect is the connection pool and the statement is an other one
     */
     public Connection connect;
     public Statement stmt;
     public PreparedStatement prepared;
     public ResultSet result;
     public String Sql;

    public DBase() {
        
        try {
            this.connect = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/mbula/Documents/NetBeansProjects/edca-fx/src/Framework/service.accdb");
            this.stmt = connect.createStatement();
        } catch (SQLException except) {
            System.out.println("Framework.DBase.<init>()");
        }
    
    }
    
    public DBase(PreparedStatement pre){
        this.prepared = pre;
    }
    
    public final void fermer(){
         try {
             this.connect.close();
         } catch (SQLException exe) {
             System.out.println("Framework.DBase.close()");
         }
    }
    
    public static void main (String [] args) throws ClassNotFoundException{ 
          
        loader gil = new loader();
        if(gil.newUsage() == true) System.out.println("Ok new usage");
        else System.out.println("not Ok new usage");
        gil.fermer();
    }

    public String getSql() {
        return Sql;
    }

    public void setSql(String Sql) {
        this.Sql = Sql;
    }
    
    
}
