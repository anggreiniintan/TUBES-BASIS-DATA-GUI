/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Aang
 */
public class config {
    static Connection con;
    static Statement stm;
    private String url;
    private Statement user;
    
      static Statement ConnecrDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Connection conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mart2","root","");
            stm = con.createStatement(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    public static void main(String args[]){
        System.out.println(config.conn());
    }
}
