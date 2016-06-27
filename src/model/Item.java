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
    private int quantidadeDoItem ;// 3 pacotes de cafe 

    
    
    public Item(int quantidadeDoItem, String codigo, String nome, int valorUnitario, String marca, int tamanho, String unidadeMedida) {
        super(codigo, nome, valorUnitario, marca, tamanho, unidadeMedida);
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
