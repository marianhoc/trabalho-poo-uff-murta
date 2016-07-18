package bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.*;

public class Conexao {

    private static Conexao conexao = null;
    private Connection conn;
    private static String user = "root";
    private static String password = "";

    private Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");                        
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado", user, password);
            
            System.out.println("funcionou");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Nao foi possivel efetuar uma conexao com o BD!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Nao foi possivel encontrar a classe referente! Verifique o driver!");
        }
    }

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            
        }
        conexao = null;
    }
    
    
    public Funcionario carregarFuncionariosDeLogIn(Map funcionarios, String cpf){
       
        try {     
            // 1-Get a connection  to database
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "poo", "poo");
           
            // 2-Create a statement
            Statement myState = conn.createStatement();
            // 3-Execute SQL query 
            String query = "SELECT * FROM funcionarios";
                    
            ResultSet resulado = myState.executeQuery(query);                                
            // 4-Process the result set
            while (resulado.next()){
                System.out.println(cpf+ " "+ resulado.getString("cpf"));
                 if (cpf.equals(resulado.getString("cpf"))){
                     
                     return new Funcionario(resulado.getString("nome"),
                        resulado.getString("sobrenome"),
                        resulado.getString("cpf"),
                        Integer.parseInt(resulado.getString("ismanager")));
                 }
             }                                             
            
        }catch(SQLException sqle){
            System.out.println(sqle);

        }catch(Exception e){
            System.out.println(" erro conexao  ");
        } 
        return null;
    }            
    
    public void carregarProdutosNoLeitor( Map inventarioNomes, Map inventarioValores){
       
        try {     
            // 1-Get a connection  to database
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "poo", "poo");
           
            // 2-Create a statement
            Statement myState = conn.createStatement();
            // 3-Execute SQL query 
            String query = "SELECT *"
                           + "FROM produtos";
                    
            ResultSet resulado = myState.executeQuery(query);                                
            // 4-Process the result set
            while (resulado.next()){
                inventarioNomes.put(resulado.getString("codigo"),
                                    resulado.getString("nome") +" " + 
                                    resulado.getString("marca")+ " " +
                                    resulado.getString("tamanho") + " " +
                                    resulado.getString("unidade")
                        );
                inventarioValores.put(resulado.getString("codigo"),resulado.getString("valor"));	

            }
            
        }catch(SQLException sqle){
            System.out.println(sqle);

        }catch(Exception e){
            System.out.println(" algum outro erro ");
        }
        
        
    }
    
}
