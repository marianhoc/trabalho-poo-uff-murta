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
public class Venda {
    private int numDoCaixa;
    private String cpfFuncionario;
    private Item [] listoDeItens;
    private int quantidadeProdutos;
    private int total;
    private String formaDePagamento;
    private int valorEntregue;

    
    //====================================================
    //========= setters and getters ======================
    //====================================================
    
    public int getNumDoCaixa() {
        return numDoCaixa;
    }

    public void setNumDoCaixa(int numDoCaixa) {
        this.numDoCaixa = numDoCaixa;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public Item[] getListoDeItens() {
        return listoDeItens;
    }

    public void setListoDeItens(Item[] listoDeItens) {
        this.listoDeItens = listoDeItens;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getValorEntregue() {
        return valorEntregue;
    }

    public void setValorEntregue(int valorEntregue) {
        this.valorEntregue = valorEntregue;
    }
    

    // ================ END OF====================
    //============setters and getters=============
    //============================================ 
    
}
