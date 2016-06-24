package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author copes
 */
public class Item extends Produtos{ // 1 item numa venda pode ser 
    private int quantidade;         // 3 pacotes de cafe 
    private int valor;              // 

    public Item(int quantidade, int valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Item() {
    }

 
    
 
    
    
    // 
    //setter and getters
    //
    
  
    public int getQuantidade() {

        return quantidade;
    }

    /**
     * indica a quantidade do item ue esta sendo vendido ou atualizado no estoque
     * @param quantidade 
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    // ======== END OF
    //setters and getters
    //============================ 


}
