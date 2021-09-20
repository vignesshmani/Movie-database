/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Vignesh
 */
public class connect {
     private static Connection con;
    private static Statement st;

    /**
     * @param args the command line arguments
     */
    
    public static Statement connection(){
        try {
            Class.forName("org.sqlite.JDBC");
            String url="jdbc:sqlite:movie.db";
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            System.out.println("connection suceddd");
            
        }catch (Exception ex){
        System.out.println("Connection failed");    
        }
        return st;
    }
    
    
}
