/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
        Connection con=null;
        
        public Conexion(){
            try{
                con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\User\\Documents\\NetBeansProjects\\CuentaBancaria\\BDCuenta\\CuentaBancaria.accdb");
                Statement st=con.createStatement();
                JOptionPane.showMessageDialog(null,"Favor ingresar los datos");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Conexion NO Exitosa"+e);
            }
        } 
        public Connection getConnection(){
        return con;
        }
}
