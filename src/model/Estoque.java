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
public class Estoque extends Item{
    
    private Item [] produtos;

    //
    //setters and getters
    //
    
    public Item[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Item[] produtos) {
        this.produtos = produtos;
    }

    // ======== END OF
    //setters and getters
    //============================ 
   
    
    
    public void atualizarEstoque(){
   
        
        
    }
    public void consultarEstoque(){
        
    }
    
    public void descontarProdutosVendidos(Item[] produtosVendidos){
        ;
    }
    
    
}
