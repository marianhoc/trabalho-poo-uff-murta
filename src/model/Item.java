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
    private Produtos item;
    private int quantidadeDoItem ;// 3 pacotes de cafe 

    
    
    public Item(int quantidadeDoItem, Produtos item ) {
        this.item = item;
        this.quantidadeDoItem = quantidadeDoItem;
    }

    
    public Item() {
    }
 
    // 
    //setter and getters
    //
    
 

    // ======== END OF
    //setters and getters
    //============================ 


}
