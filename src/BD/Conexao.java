package bd;

import java.sql.*;

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
}
