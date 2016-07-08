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
public class Produtos {
    private int codigo;
    private String nome;
    private int valorUnitario;  // em centavos
    private String marca;
    private int tamanho;       // quantidade  exemplo  300   500   // DUVIDAS  como nomear o tamanho
    private String unidadeMedida; // de que ??             ml   gr

    public Produtos(int codigo, String nome, int valorUnitario, String marca, int tamanho, String unidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.marca = marca;
        this.tamanho = tamanho;
        this.unidadeMedida = unidadeMedida;
    }

    public Produtos(){
        
    }
 
    // setters and getters
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    
    // ======== END OF
    //setters and getters
    //============================ 
    
     
    
}
