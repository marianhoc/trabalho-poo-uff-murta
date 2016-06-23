/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodigo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author copes
 */
public class TelaPrincipal {
    
    
    
    
    
    public static void imprimeTela(){
        //FRAME PRINCIPAL
        JFrame framePrincipal = new JFrame("Supermercado da UFF");
        
        //MAIN PANEL
        JPanel painel = new JPanel();
        
        // BUTTONS 
        JButton test = new JButton("Click here");
        
        
        framePrincipal.add(test);
        
        
        framePrincipal.pack();
        framePrincipal.setVisible(true);
                
        
    }
}
