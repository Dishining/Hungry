/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.web2017;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThinkPad
 */
public class datautil {
     private Connection conn;
     private Statement stmt;
     public datautil() throws ClassNotFoundException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=hungry;user=JUNE;password=SJW52131306");
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(datautil.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void changetag(String a) throws SQLException
     {
         String b=a;
         stmt.execute("update food set tag='1' where number='"+b+"'");
     }
      public List getName() throws SQLException
     {
          List name = new ArrayList();
          ResultSet resultset=stmt.executeQuery("select name from food where tag='1'");
           while(resultset.next())
          {
             name.add(resultset.getString("name"));  
          }
           return name;
     }
       public List getPrice() throws SQLException
     {
          List price = new ArrayList();
          ResultSet resultset=stmt.executeQuery("select price from food where tag='1'");
           while(resultset.next())
          {
             price.add(resultset.getString("price"));  
          }
           return price;
     }
        public List getImage() throws SQLException
     {
          List image = new ArrayList();
          ResultSet resultset=stmt.executeQuery("select image from food where tag='1'");
           while(resultset.next())
          {
             image.add(resultset.getString("image"));  
          }
           return image;
     }
         
     public void delete() throws SQLException
     {
         stmt.execute("update food set tag='0'");
     }
}
