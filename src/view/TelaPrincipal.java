/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author copes
 */


public class TelaPrincipal extends JFrame{

    public TelaPrincipal() {
        super("Mercadinho");
        imprimeTelaInicio();
    }
    
    /**
     * Imprime a tela de trabalho do Manager
     */
    public void imprimeTelaManager(){
     
      
    }
    
   
    public void imprimeTelaCaixa(){
        // TODO  tela do caixa
    
     
        
    }
    
    public void imprimeTelaInicio(){
        //FRAME PRINCIPAL
                
        // PAINEL
        JPanel painelEsquerda = new JPanel();
        
        // BUTTONS 
        JButton test = new JButton("Click here");                                                        
        
        // Configuration a janela
        this.pack();
        this.setSize(800, 600);
        this.setBackground(Color.yellow);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
}


