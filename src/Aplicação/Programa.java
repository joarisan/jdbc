/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicação;

import java.sql.ResultSet;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import jdddc.Conexao;

/**
 *
 * @author Geral
 */
public class Programa {
    public static void main(String[] args) {
       // Conexao conexao = new Conexao();
       // Connection con = conexao.conectar();
       // conexao.desconectar(con);
        Connection conexao = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            conexao = Conexao.conectar();
            st = conexao.createStatement();
            rs = st.executeQuery("select * from vendedor");
            
            while (rs.next()){
               
                System.out.println(rs.getInt("Id")+" - "+rs.getString("Nome")+" - "+ rs.getString("Email")+" - "+ rs.getDate("DataNascimento")+ " - "+ rs.getDouble("SalarioBase"));
            //JOptionPane.showMessageDialog(null,rs.getInt("Id")+" - "+rs.getString("Nome")+" - "+ rs.getNString("Email"));
            } 
                
            
            
        }catch (Exception e){
            
        }
    }
    
}
