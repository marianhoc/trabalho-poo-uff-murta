package model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author copes
 */
//public class Estoque implements Map<Integer, Item>{
public class Estoque extends ArrayList<Item>{
    private static Estoque estoque = null;
    
    public static synchronized Estoque getEstoque(){
        if (estoque == null){
            estoque = new Estoque();
        }
        return estoque;
    }
    
 //   singleton
      
    
    private Estoque(){   
        criarEstoque();
    }

    public void atualizarEstoque() {
        // TODO Quem faz?
        //atualizar estoque.  Gerente adiciona produtos no estoque. Vendas tiram produtos.
    }
    
    public void consultarEstoqueArray(){
        int i = 0;  
        for (i=0; i<this.size()-1; i++){
            System.out.println(this.get(i).toString());
        }   
    }  
    
    /**
     * Retorna un array ordenado alfabeticamente com os nomes dos produtos no Estoque
     * @return 
     */
    public String [] pegarNomeDeProdutos(){
        ArrayList<String> nomes = new ArrayList<>();
        int i;
        for(i=0; i<this.size(); i++){
            nomes.add(this.get(i).toString());
        }
        nomes.sort(null);
        return nomes.toArray(new String[nomes.size()]);
    }
    
        
    /**
     * Retorna un array de String em ordem crescente com os codigos dos produtos no Estoque
     * @return 
     */
    public String [] pegarCodigoDosProdutos(){
        ArrayList<String> codigos = new ArrayList<>();
        int i;
        for(i=0; i<this.size(); i++){
            codigos.add(String.valueOf(this.get(i).getItem().getCodigo()));
        }
        codigos.sort(null);
        return codigos.toArray(new String[codigos.size()]);
    }
    
    /**
     * recebe o codigo do produto e devolve o valor unitario em centavos.
     * Caso o produto nao estaja ainda cadastrado return = 0;
     * 
     * @param codigo do produto
     * @return 
     */
    public int consultarValorProdutoPeloCodigo(int codigo){
        for (Item i: this){
            if(i.getItem().getCodigo()== codigo){
                return i.getItem().getValorUnitario();
            }
        }   
        return 0;// Produto nao cadastrado
        
    }
        
    
    public void descontarProdutosVendidos(Venda produtosVendidos){
        // TODO quem faz??
    }
    
    /**
     * Cria o estoque inicial
     * uma lista de Items inicializados com 50 unidades cada e com os dados do produto
     */
    public void criarEstoque(){
        //  novo Item = quant + Produto-> |Codigo | Nome    | Valor |Marca ou tipo|Tamanho |unidade de medida
        this.add(new Item(50, new Produtos(123456, "cafe",     450, "pilao",        50,     "gr")));
        this.add(new Item(50, new Produtos(123457, "leite",    450, "Parmalat",     1000,   "ml")));
        this.add(new Item(50, new Produtos(123467, "leite",    450, "Quata",        1000,   "ml")));
        this.add(new Item(50, new Produtos(444444, "pimenta",  300, "pilao",        50,     "gr")));
        this.add(new Item(50, new Produtos(654987, "banana",   299, "nanica",       50,     "gr")));
        this.add(new Item(50, new Produtos(112233, "laranja",  199, "pera",         50,     "gr")));        
        this.add(new Item(50, new Produtos(102133, "laranja",  199, "lima",         50,     "gr")));        
        this.add(new Item(50, new Produtos(141232, "banana",   199, "d'agua",       50,     "gr")));        
        this.add(new Item(50, new Produtos(152344, "lima",     199, "da persia",    50,     "gr")));        

        
    }

    
    
}



