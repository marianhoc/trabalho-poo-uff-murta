/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Estoque;

/**
 *
 * @author copes
 */
public class ControleNovoItem implements ListSelectionListener, ChangeListener{
  
    private Estoque estoque;
    private JLabel ultimoItem;
    private JSpinner unidades;

    public ControleNovoItem(Estoque estoque, JSpinner unidades, JLabel labelUltimoItem) {
        this.estoque = estoque;
        this.ultimoItem = labelUltimoItem;
        this.unidades = unidades;
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
        StringBuffer nome = new StringBuffer();
        StringBuffer codigo = new StringBuffer();
        
        StringBuffer texto = new StringBuffer();
        int i = 0 ;
        
             for (String s : estoque.pegarNomeDeProdutos())
                 if(s.equals(estoque.pegarNomeDeProdutos()[e.getLastIndex()])){
                     nome.append(s);
                 }
             for (String s : estoque.pegarCodigoDosProdutos())
                 if(s.equals(estoque.pegarCodigoDosProdutos()[e.getLastIndex()])){
                     codigo.append(s);
                 }
                          
            try{
                while (! codigo.toString().equals(Integer.toString(estoque.get(i).getItem().getCodigo()))){
                    System.out.println(codigo.toString() + " " +Integer.toString(estoque.get(i).getItem().getCodigo()));    
                    i++;   
                    }
                }
            catch(IndexOutOfBoundsException iobe){
                System.out.println("IndexOutOfBoundsException \nCONFERIR LINHA 60 ControleNovoItem ");                
            }catch(Exception outro){
                System.out.println("otra exception , CONFERIR LINHA 60 ControleNovoItem  ");                
            }
        try{
            
            texto.append(unidades.getValue() 
                        + "  " 
                        + nome.toString());
                        //+ ultimoItem.getText().substring(3));
                                                  
                ultimoItem.setText(texto.toString());
            
                  ultimoItem.setText(texto.toString());
               } catch(Exception ex){
                   // TODO  implementar exceçao
               }
                
                                
                

//TODO
        // pegar o codigo ou nome selecionado e procurar o item        
        // carregar no campo de ultimo item a informação 
        // quant de unidades + item + valor total        
    }

    @Override
    public void stateChanged(ChangeEvent e) {      
        StringBuffer texto = new StringBuffer();        
        
            try{                  
                texto.append(unidades.getValue() 
                        + "  " 
                        + ultimoItem.getText().substring(3));
                                                  
                ultimoItem.setText(texto.toString());
                 
               } catch(Exception ex){
                   // TODO  implementar exceçao
               }
        
    }
    
}
