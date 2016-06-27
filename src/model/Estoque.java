package model;

import java.awt.List;
import java.util.ArrayList;

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

 
    
    // =====================
    // ===  setters and getters
    // ======================

    

    //=================== END OF =======================
    //============= setters and getters ================
    //================================================== 
   
    
    
    public void atualizarEstoque(){   
        
        
    }
    public void consultarEstoque(){
        
    }
    
    public void descontarProdutosVendidos(Venda produtosVendidos){
    
    }
    
    public static void criarEstoque(){
        ArrayList<Item> estoque = new ArrayList<>();        
 
        estoque.add(new Item(50, "1234", "cafe", 550, "pilao", 500, "gr"));
        estoque.add(new Item(50, "2345", "chocololate em po", 550, "nescao", 500, "gr"));
        estoque.add(new Item(50, "3456", "leite", 550, "parmalat", 1000, "ml"));
        estoque.add(new Item(50, "4567", "queijo", 550, "pilao", 500, "gr"));
        estoque.add(new Item(50, "5678", "presunto", 550, "seara", 1000, "gr"));
        estoque.add(new Item(50, "6789", "detergente", 550, "pilao", 500, "gr"));
        estoque.add(new Item(50, "9876", "macarrao", 550, "piraque", 500, "gr"));
        estoque.add(new Item(50, "8765", "arroz", 550, "chinezinho", 500, "gr"));
        estoque.add(new Item(50, "7654", "banana", 550, "nanica", 500, "gr"));
        estoque.add(new Item(50, "6543", "laranja", 550, "lima", 500, "gr"));
        estoque.add(new Item(50, "5432", "manga", 550, "tomy", 1000, "gr"));
        estoque.add(new Item(50, "4321", "cerveja", 550, "skol", 600, ",ml"));
        estoque.add(new Item(50, "1112", "cerveja", 550, "amstel", 600, ",ml"));
        estoque.add(new Item(50, "1113", "cerveja", 550, "heineken", 600, "ml"));
                
        
        
    }
    
    
}


DUVIDAS
        
ESTOQUE e classe??
classe manager..  e neccesaria?? ou com o atributo de funcionario resole??

