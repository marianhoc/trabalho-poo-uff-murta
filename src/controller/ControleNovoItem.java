/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author copes
 */
public class ControleNovoItem implements ListSelectionListener{
  
    private String [] codigo;
    private JLabel ultimoItem;

    public ControleNovoItem(String[] codigo, JLabel labelUltimoItem) {
        this.codigo = codigo;
        this.ultimoItem = labelUltimoItem;
    }


    
    
    
    
    private void listaCodigosMouseReleased(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void listaNomesMouseReleased(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void spinnerUnidadesMouseReleased(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }   
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
            //ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                
                ultimoItem.setText(codigo[e.getLastIndex()]);
                
                
                
                

//TODO
        // pegar o codigo ou nome selecionado e procurar o item
        // pegar o valor da quantidade de unidades 
        // carregar no campo de ultimo item a informação 
        // quant de unidades + item + valor total
        
    }
    
}
