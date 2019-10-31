/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.test;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;


/**
 *
 * @author Aplicaciones D
 */
public class test {
    public Connection getConexion() {
    Connection conexion = null;
    String servidor="localhost";
    String puerto="8432";
    String baseDatos="supermercado";
    String url= "jdbc:postgresql://"+servidor+":"+puerto+"/"+baseDatos;
    String usuario="postgres";
    String clave="admin";
    try{
conexion = DriverManager.getConnection(url,usuario,clave);
    } catch(SQLException ex){
    Logger.getLogger(test.class.getName()).log(Level.SEVERE,null, ex);
}
    return conexion;    
    }

public void insertar(int codigo, String nombre, double precio){

Connection conexion= getConexion();

String sql ="insert into producto values ("+codigo+"','"+nombre+"','"+precio+"','";

try (Statement st=conexion.createStatement()){
    st.executeUpdate(sql);
}catch (Exception e){
e.printStackTrace();
}


}



}
    
    
    

