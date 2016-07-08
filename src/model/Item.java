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
public class Item { // 1 item numa venda pode ser 
    private Produtos item;// 3 pacotes de cafe 
    private int quantidadeDoItem ;

    
    
    public Item(int quantidadeDoItem, Produtos item ) {
        this.item = item;
        this.quantidadeDoItem = quantidadeDoItem;
    }

    
    public Item() {
    }
 
    


    @Override
    public String toString() {
        return item.getNome() + " - " + item.getMarca() ;
    }
    
     // 
    //setter and getters
    //


    public Produtos getItem() {
        return item;
    }

    public void setItem(Produtos item) {
        this.item = item;
    }

    public int getQuantidadeDoItem() {
        return quantidadeDoItem;
    }

    public void setQuantidadeDoItem(int quantidadeDoItem) {
        this.quantidadeDoItem = quantidadeDoItem;
    }

     // ======== END OF
    //setters and getters
    //============================ 


}
