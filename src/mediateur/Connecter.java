/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * merabet 
 */
public class Connecter {
    Connection con;
    String username="integ1";
    String password="123";
    String URL_Pilote="oracle.jdbc.driver.OracleDriver";
   //  String URL_Pilote="oracle.jdbc-driver-locator";
    String URL_bd="jdbc:oracle:thin:@localhost:1521:XE";
    public Connecter(){//constructeurnir
        //.charger le pilote
        //connecter a la base de données
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/integ","root","");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {System.out.println("erreur");
            System.out.println(e);
        }
    }
    Connection obtenirConnexion(){
        return con;
    }
}
