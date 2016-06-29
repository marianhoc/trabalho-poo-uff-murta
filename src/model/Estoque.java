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
public class Estoque {
    private Item [] itens; // trocar por um Map
    
    
 //   singleton  ver
    
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
    
    public int consultarValorProdutoPeloCodigo(int codigo){
        
        return 1;
    }
    
    public void descontarProdutosVendidos(Venda produtosVendidos){
    
    }
    
    public static void criarEstoque(){
        ArrayList<Item> estoque = new ArrayList<>();        
 
        //  adiciona um ITEM no ESTOQUE
        //           ITEM = Quantidade de um PRODUTO
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));
        estoque.add(new Item(50, new Produtos("codigo", "nome", 0, "marca", 0, "unidademedida")));

                
        
        
    }
    
    
}



