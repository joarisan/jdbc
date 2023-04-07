package jdddc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Conexao {
    // driando um metodo resposanvel por estabelecer a conecção com o banco 

    public static Connection conectar() {
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        // ARNAZENAR informações  referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/aulajdbc";
        String user = "root";
        String senha = "root";
        //estabelecer conexao com o banco

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso. " + conexao);
            return conexao;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!!!" + conexao);
            return null;
        }

    }

    public static void desconectar(Connection conexao) {
        try{
            if ((conexao != null) && (!conexao.isClosed())){
            conexao.close();
            JOptionPane.showMessageDialog(null,"Desconectado  do Banco de Dados!!!");
        }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Não foi possivel desconectar do banco de dados");
        }
    }
}
