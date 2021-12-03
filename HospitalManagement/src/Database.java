
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Database {
     private Connection connection = null;
    
    public Connection setConnection(){
    try{
       String url = "jdbc:mysql://localhost:3306/rumahsakit"; 
       String user="root";
       String pass ="";
       String db ="rumahsakit";
       
       Class.forName("com.mysql.jdbc.Driver");
      // DriverManager.registerDriver(new com.mysql.jdbc.Driver);
       connection =DriverManager.getConnection(url,user,pass);
    }catch(Exception e){
        System.out.println("Error " + e.getMessage());
    }
    return connection;
        
        }

}
