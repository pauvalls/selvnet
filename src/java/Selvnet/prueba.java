/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selvnet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pauva
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Alumne> lista = new ArrayList<Alumne>();

        SQLConnection con=new SQLConnection();
        Connection conn= con.conectar();
       ResultSet rs = con.executequery("Select * from alumne",conn);
        try {
            while (rs.next()) {
                Alumne al = new Alumne(rs.getString("nom"), rs.getInt("codi"));
                lista.add(al);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Selvnet.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
    
}
