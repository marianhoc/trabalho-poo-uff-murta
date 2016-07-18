/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bd.Conexao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Caixa;
import model.Estoque;
import model.Funcionario;
import model.Venda;

/**
 *
 * @author copes
 */
public class TestCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexao sql = Conexao.getInstance();
        
        
        
        //=================== FUNCIONARIOS ==========================

        // ===================== CAIXAS ===================
        
        Caixa caixa1 = new Caixa(1);
        Caixa caixa2 = new Caixa(2);
        Caixa caixa3 = new Caixa(3);        
        
        // ===============  Criar estoque  ================
        
        
        //estoque.consultarEstoqueArray();
        

        
       
        
        // ============== Registo Vendas ===============
        
        ArrayList<Venda> vendas = new ArrayList<>();
        
        //new TelaCaixaManual().setVisible(true);
        new LogInFuncionarios().setVisible(true);
        //estoque.criarEstoqueMap();
        //estoque.consultarEstoqueMap();
        
        
       
        
        
    }
    
}
