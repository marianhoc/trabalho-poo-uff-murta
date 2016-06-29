/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Caixa;
import model.Estoque;
import model.Funcionario;

/**
 *
 * @author copes
 */
public class TestCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //=================== FUNCIONARIOS ==========================
        Funcionario funcionario1 = new Funcionario("Mariano", "Copes", "123456", false);
        Funcionario funcionario2 = new Funcionario("Leonardo", "Potugal", "987654", false);
        Funcionario funcionario3 = new Funcionario("Evandro", "naosei", "111111", false);
        Funcionario funcionario4 = new Funcionario("Caio1", "qwertyu", "222222", false);
        Funcionario funcionario5 = new Funcionario("Caio2", "asdfghj", "333333", false);
        Funcionario funcionario6 = new Funcionario("Leonardo", "Murta", "555555", true);
        
        // ===================== CAIXAS ===================
        
        Caixa caixa1 = new Caixa(1);
        Caixa caixa2 = new Caixa(2);
        Caixa caixa3 = new Caixa(3);
        
        
        // criar estoque
        Estoque.criarEstoque();
  
        
       
        
        
    }
    
}
