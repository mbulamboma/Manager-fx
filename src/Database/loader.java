/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Framework.DBase;
import java.sql.*;
import java.util.Calendar; 

/**
 *
 * @author mbula
 */
public class loader extends DBase {
    final int now;
    
    public loader() {
        super();
        now = (int) Calendar.getInstance().getTimeInMillis();
    }
    
    public loader(PreparedStatement pre){
        super(pre);
        now = (int) Calendar.getInstance().getTimeInMillis();
    }
    
    
    public boolean newUsage(){
        try {
            this.setSql("INSERT INTO usages (jour) VALUES ("+ this.now +")");
            stmt.execute(this.Sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    
    }
    
    
}
